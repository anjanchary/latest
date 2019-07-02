package reposit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lowagie.text.List;

public class Repository {
	
	private static final String Set = null;
	public WebDriver driver;
	public WebDriverWait wait;
	
	public void launch(String browser){
		
		switch (browser) {
		case "chrome":
			
			driver=new ChromeDriver();
			
			break;
			
			case "firefox":
			
			driver=new FirefoxDriver();
			break;
			
		default:
			break;
		}
	}
	
	public void browser(String url){
		
		driver.get(url);
	}
	
	public void time(int sec){
		
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public void detime(int sec) throws InterruptedException{
		
		Thread.sleep(sec);
	}
		
		public void locati(By xpath,String text ){
			
			
			WebElement loc=wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
			loc.clear();
			loc.sendKeys(text);
		}	
			
			
		public void exploc(By xpath){
			wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).click();
			
		}	
		
		public void drop(By xpath,String text){
			
			new Select(driver.findElement(xpath)).selectByVisibleText(text);
			
			
			
		}
		
		public void clickable(By xpath){
			
			wait.until(ExpectedConditions.elementToBeClickable(xpath)).click();
			
		}
		
		public void visible(By xpath){
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).click();
			
		}
		
		public void mouse(By xpath){
			
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
			new Actions(driver).moveToElement(element).click().perform();
			
			
		}
		
		public void mulwindow(String wintitle){
			
			String main=driver.getWindowHandle();
			
			Set<String> allwin= driver.getWindowHandles();
			
			for (String eachwin : allwin) {
				
				driver.switchTo().window(eachwin);
				
				String title=driver.getTitle();
				
				if(title.contains(wintitle)){
					
					break;
					
				}
			}
		}
		
		
		public WebElement table(By xpath,int row,int col){
			
			WebElement table=wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
			
		java.util.List<WebElement> row1=table.findElements(By.tagName("tr"));
		
		WebElement cell=row1.get(row);
		
		java.util.List<WebElement> col1=cell.findElements(By.tagName("td"));
		
		WebElement cell1=col1.get(col);
			
		
		return table;
			
			
		}
		
		public void robot() throws AWTException{
			
			new Robot().mouseMove(100, 400);
			
			
		}
		
		
		
	
	

}

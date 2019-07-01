package commaseperate;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;

public class value {
	
	

	public static void main(String[] args) throws IOException {
		
		
		
		String path="E:\\vinay\\GIT Repository\\latest\\latest\\src\\commaseperate\\value.csv";
		
		FileReader fr=new FileReader(path);
		
		CSVReader read=new CSVReader(fr);
		
		read.readNext();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		
		driver.manage().window().maximize();
		
		
		//String line1[]=read.readNext();
		//String line2[]=read.readNext();
		
		String line[];
			while((line=read.readNext())!=null)
				{
					
					
					WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
					user.clear();
					user.sendKeys(line[0]);
					
						
					WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
					pass.clear();
					pass.sendKeys(line[1]);
					
					
					driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
					
					driver.navigate().back();
					driver.navigate().refresh();
					
					
			
				}
		
		

	}

}

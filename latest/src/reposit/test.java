package reposit;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Repository obj=new Repository();
		
		obj.launch("chrome");
		obj.browser("https://www.facebook.com/");
		
		
		obj.clickable(By.xpath("//label[@id='loginbutton']"));

	}

}

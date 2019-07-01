package common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests {
	public static void main(String[] args) throws IOException{
		
		
		//Reading
		
		String path="E:\\vinay\\GIT Repository\\latest\\latest\\rep.properties";
		
		FileInputStream fi=new FileInputStream(path);
		
		Properties rep=new Properties();
		rep.load(fi);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(rep.getProperty("url"));
		
	
		
		
		WebElement mobile=driver.findElement(By.xpath(rep.getProperty("mobile")));
		mobile.clear();
		mobile.sendKeys("kumar@gmial.com");

		WebElement fname=driver.findElement(By.xpath(rep.getProperty("fname")));
		fname.clear();
		fname.sendKeys("kumar");
		
		WebElement uname=driver.findElement(By.xpath(rep.getProperty("uname")));
		uname.clear();
		uname.sendKeys("manu");
		
		WebElement pass=driver.findElement(By.xpath(rep.getProperty("pass")));
		pass.clear();
		pass.sendKeys("54654664764");
		
		driver.findElement(By.xpath(rep.getProperty("signup"))).click();
		
		
		
		//Writing
		
		rep.setProperty("aboutus", "//a[@href='/about/us/']");
		
		rep.store(new FileOutputStream(path), "newone ");
		
		driver.findElement(By.xpath(rep.getProperty("aboutus"))).click();
		
	}
	}
		
	
	


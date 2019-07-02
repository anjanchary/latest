package Junittest;

import static org.junit.Assert.*;

import java.io.File;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unit {
	
	public static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		driver=new ChromeDriver();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.navigate().refresh();
	}

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.instagram.com/");
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(4000);
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		FileUtils.copyFile(file, new File("E:\\vinay\\GIT Repository\\latest\\latest\\New folder\\insta.png"));
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}

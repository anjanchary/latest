package screen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.internal.connection.RouteSelector.Selection;

public class pathcpoy {
	
	public static void main(String[] args) throws AWTException, InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://my.naukri.com/account/register/basicdetails");
		
		driver.findElement(By.xpath("(//button[@name='userType'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='uploadCV']")).click();
		
		Robot robot=new Robot();
		
		Thread.sleep(3000);
		
		String path="E:\\vinay\\GIT Repository\\latest\\latest\\New folder\\Career Objective.docx";
		
		StringSelection sel=new StringSelection(path);
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(sel, sel);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
	}

}

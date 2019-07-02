package screen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.runtype;

public class robosc {

	public static void main(String[] args) throws AWTException, IOException {

		Runtime.getRuntime().exec("notepad.exe");
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Robot robot=new Robot();
		
		Dimension scr=Toolkit.getDefaultToolkit().getScreenSize();
		
		BufferedImage img=robot.createScreenCapture(new Rectangle(scr));
		
		File path=new File("E:\\vinay\\GIT Repository\\latest\\latest\\New folder\\robot.png");
		ImageIO.write(img, "png", path);
		
		*/
	}

}

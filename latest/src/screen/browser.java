package screen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

public class browser {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Date date=new Date();
		
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		
		String time=sd.format(date);
		
		
		System.out.println(time);
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("New folder\\"+time+"imag.jpeg"));
		
		
		
	}

}

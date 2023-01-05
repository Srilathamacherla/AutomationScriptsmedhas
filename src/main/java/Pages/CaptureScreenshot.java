/**
 * Srilatha
 */
package Pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

/**
 * @author WalkingTree
 *
 */


public class CaptureScreenshot{
	static WebDriver driver;
	
		
	public void capturescreenshotimage(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			TakesScreenshot takes=(TakesScreenshot)driver;
			File source=takes.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new  File("./screenshots/" +result.getStatus() + ".png" ));
			System.out.println(result.getName()+"message() screenshot captured.");
			
		}
		
		
		/*
		 * public static String getCurrentDateTime() { DateFormat customFormat = new
		 * SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		 * 
		 * 
		 * Date currentDate = new Date();
		 * 
		 * return customFormat.format(currentDate);
		 * 
		 * }
		 */
		
		
	}
	
}
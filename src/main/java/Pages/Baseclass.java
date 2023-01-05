/**
 * Srilatha
 */
package Pages;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * @author WalkingTree
 *
 */
public class Baseclass {
	WebDriver driver;

	
	static CaptureScreenshot cp;
	@BeforeClass
	public void setupbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WalkingTree\\eclipse-workspace\\NewProject\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void applicationurl() {
		driver.get("http://medhas.walkingtree.tech/");

	}

	@AfterClass
	public void aftermethod(ITestResult result4) throws Exception {

		cp.capturescreenshotimage(result4);
	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}

}
/*
 * @AfterMethod public void teardown() { driver.quit(); }
 * 
 * }
 */

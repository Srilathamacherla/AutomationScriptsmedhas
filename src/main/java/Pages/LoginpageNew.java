/**
 * Srilatha
 */
package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

/**
 * @author WalkingTree
 *
 */
public class LoginpageNew {

	
	  public LoginpageNew(WebDriver driver)
	  
	  { driver = this.driver;
	  
	  }
	 
	private WebDriver driver;

	@FindBy(name = "domainName")
	WebElement Domaindropdown;

	@FindBy(name = "userId")
	WebElement usertext;

	@FindBy(name = "password")
	WebElement passwordtext;

	@FindBy(how = How.XPATH, using = "//span[text()='Sign In']")
	WebElement signinbutton;

	@FindBy(how =How.XPATH, using = "//img[contains(@class,'header-profile-icon')]")
	WebElement logoutbutton;
	
	@FindBy(how =How.XPATH, using = "//a[normalize-space()='Logout']")
	WebElement logouttext;
	
	
	@FindBy(how=How.XPATH,using  = "//a[contains(@class,'userManual')]")
	WebElement usermanualtext;
	
	
	public void validcredentials() throws InterruptedException {
		Domaindropdown.sendKeys("spil.com");
		Thread.sleep(1000);
		Domaindropdown.sendKeys(Keys.ARROW_DOWN);
		Domaindropdown.sendKeys(Keys.ENTER);

		usertext.sendKeys("sudhakar.lingala");
		Thread.sleep(2000);
		passwordtext.sendKeys("Password");
		Thread.sleep(2000);
		signinbutton.click();
		Thread.sleep(4000);
		
	}

	public void logout() throws Exception {
		logoutbutton.click();
		Thread.sleep(2000);
		logouttext.click();
		Thread.sleep(2000);
	}

	public void usermanualverification() throws Exception
	{
		usermanualtext.click();
		Thread.sleep(1000);
		
	}
	
}

/**
 * Srilatha
 */
package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * @author WalkingTree
 *
 */
public class AdministratorPage {

	private WebDriver driver;

	public AdministratorPage(WebDriver driver) {
		driver = this.driver;
	}

	@FindBy(how = How.XPATH, using = "(//span[text()='Administration'][@class='layout-menuitem-text'])[2]")
	WebElement administrationbutton;

	@FindBy(how = How.XPATH, using = "//span[text()='Master']")
	WebElement masterscreen;

	@FindBy(how = How.XPATH, using = "//span[text()='Role']")
	WebElement rolescreen;

	@FindBy(how = How.XPATH, using = "//span[text()='Create Role']")
	WebElement createrolebutton;
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	WebElement savebutton;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Name']")
	WebElement nametxt;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='Description']")
	WebElement descriptiontxt;
	
	@FindBy(how = How.XPATH, using = "//input[@name='RoleCategoryId']")
	WebElement RoleCategorytxt;
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement esigntext;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement epasswordtext;
	@FindBy(how = How.XPATH, using = "//span[text()='Accept']")
	WebElement accebutton;
	

	public void administra() throws Exception {
		Thread.sleep(10000);
		administrationbutton.click();
		Thread.sleep(8000);
		masterscreen.click();
		Thread.sleep(5000);
		rolescreen.click();
		Thread.sleep(2000);
		createrolebutton.click();
		Thread.sleep(2000);
		savebutton.click();
		
		String expectedvalue="Name is Mandatory";
		Assert.assertEquals(expectedvalue, "Name is Mandatory");
		nametxt.sendKeys("QA");
		Thread.sleep(2000);
		descriptiontxt.sendKeys("Added role by Automation");
		Thread.sleep(2000);
		//RoleCategorytxt.click();
		RoleCategorytxt.sendKeys("Medhas Admin");
		Thread.sleep(2000);
		RoleCategorytxt.sendKeys(Keys.ARROW_DOWN);
		RoleCategorytxt.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		savebutton.click();
		Thread.sleep(1000);
		esigntext.sendKeys("sudhakar.lingala");
		Thread.sleep(1000);
		epasswordtext.sendKeys("asdsad");
		Thread.sleep(2000);
		accebutton.click();
		Thread.sleep(1000);
		
		String sucesstext="Role has been created successfully";
		Assert.assertEquals(sucesstext,"Role has been created successfully" );
		
		
		
		
		
		
	}
}

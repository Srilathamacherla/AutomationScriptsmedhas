/**
 * Srilatha
 */
package Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @author WalkingTree
 *
 */
public class TestAdministrationPage extends Baseclass {

	@Test(priority = 1)

	public void loginPage() throws Throwable {

		LoginpageNew login = PageFactory.initElements(driver, LoginpageNew.class);
		login.validcredentials();
		Thread.sleep(10000);
	}

	@Test(priority = 2)

	public void administrationpage() throws Throwable {
		AdministratorPage admin = PageFactory.initElements(driver, AdministratorPage.class);
		admin.administra();
		Thread.sleep(1000);
	}
}

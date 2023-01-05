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
public class TestLoginpageNew extends Baseclass{

	
	@Test
	public void loginFuntionality() throws Exception
	{
		LoginpageNew login=PageFactory.initElements(driver,LoginpageNew.class);
		login.validcredentials();
		login.logout();
		login.usermanualverification();
		}



}

package test.PageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.Assert;





public class SalesforceTest extends BaseTest {
	
	@Test(groups={"pageObject"})
	public void init() throws Exception{
		
		SalesforceLoginPage sflogin= PageFactory.initElements(driver, SalesforceLoginPage.class);
		sflogin.enterUserName("sagar.shinde@fca.org.uk");
		sflogin.enterPassword("test123$");
		Assert.assertEquals("Log In to Sandbox", sflogin.getLoginButtonText());
			
	}

}

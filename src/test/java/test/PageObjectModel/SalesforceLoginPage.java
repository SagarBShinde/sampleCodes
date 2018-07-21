package test.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SalesforceLoginPage {
	
	WebDriver driver;
	 
    public SalesforceLoginPage(WebDriver driver){ 
            this.driver=driver; 
    }
    
    @FindBy(how=How.ID, using="username") WebElement userName;
	@FindBy(how=How.ID, using="password") WebElement password;
	@FindBy(how=How.XPATH, using="//*[@id='Login']") WebElement loginButton;


public void enterUserName(String userName){
	
	this.userName.sendKeys(userName);
	
}

public void enterPassword(String password){
	
	this.password.sendKeys(password);;
	
}

public void clickLogin(){
	
	loginButton.click();
}

public String getLoginButtonText(){
	
	return loginButton.getAttribute("value");
	
}


}
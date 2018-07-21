package PracticeCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetryFunction {
	
	static WebDriver D;

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.path", ".\\chromedriver.exe");
		D= new ChromeDriver();
		D.get("https://test.salesforce.com/");
		safeFind(D,"username1").sendKeys("UserName");
		
		
		
		
	}
	
	public static WebElement safeFind(WebDriver D, String locator){
		
		int retryCount =0;
		
		while (retryCount<3){
			try{
				WebElement e=D.findElement(By.id(locator));
				return e;
		
			}catch(Exception e){
				//System.out.println(e.getMessage());
				System.out.println("This is retry:"+ retryCount);
				retryCount++;
				if (retryCount==3)
					throw e;
			}
		
			
		}
		return null;
		
		
	}	
	

}

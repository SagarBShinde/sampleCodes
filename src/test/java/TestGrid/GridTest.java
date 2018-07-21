package TestGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PracticeCodes.DriverFactory;

public class GridTest {
	
	
@Test(dataProvider="browserDataProvider")

public void testSalesforce1(String Browser, Platform P) throws MalformedURLException{
	
	try {
		System.out.println("BrowserName is:"+ Browser);
		System.out.println("Platform is:"+ P.getPartOfOsName());
		WebDriver D= (new DriverFactory()).getDriver(true,Browser,"http://192.168.0.103:4444",P);
		D.get("https://test.salesforce.com/");
		D.manage().window().maximize();
		D.findElement(By.id("username")).sendKeys("sagarshinde");
		D.findElement(By.id("password")).sendKeys("sagarshinde");
		D.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		D.quit();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@Test(enabled=false)
public void testSalesforce1a() throws MalformedURLException{
	
	//DesiredCapabilities cap = DesiredCapabilities.chrome();
	//cap.setBrowserName("chrome");
	//cap.setPlatform(Platform.WIN10);
	
	try {
	
		WebDriver D= (new DriverFactory()).getDriver(true,"chrome", "http://192.168.0.102:4444", Platform.WIN10);
		D.get("https://test.salesforce.com/");
		D.manage().window().maximize();
		D.findElement(By.id("username")).sendKeys("sagarshinde");
		D.findElement(By.id("password")).sendKeys("sagarshinde");
		D.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		D.quit();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	@Test(enabled=false)
	public void testSalesforce2() throws MalformedURLException{
		
		//DesiredCapabilities cap = DesiredCapabilities.firefox();
		//cap.setBrowserName("firefox");
		//cap.setPlatform(Platform.LINUX);
		
		try {
		
			WebDriver D= (new DriverFactory()).getDriver(true,"firefox", "http://192.168.0.102:4444", Platform.LINUX);
			D.get("https://test.salesforce.com/");
			D.manage().window().maximize();
			D.findElement(By.id("username")).sendKeys("sagarshinde");
			D.findElement(By.id("password")).sendKeys("sagarshinde");
			D.findElement(By.id("Login")).click();
			Thread.sleep(5000);
			D.quit();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		@Test(enabled=false)
		public void testSalesforce2a() throws MalformedURLException{
			
			//DesiredCapabilities cap = DesiredCapabilities.firefox();
			//cap.setBrowserName("firefox");
			//cap.setPlatform(Platform.LINUX);
			
			try {
			
				WebDriver D= (new DriverFactory()).getDriver(true,"firefox", "http://192.168.0.102:4444", Platform.LINUX);
				D.get("https://test.salesforce.com/");
				D.manage().window().maximize();
				D.findElement(By.id("username")).sendKeys("sagarshinde");
				D.findElement(By.id("password")).sendKeys("sagarshinde");
				D.findElement(By.id("Login")).click();
				Thread.sleep(5000);
				D.quit();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
}
		
		@DataProvider (parallel=true)
		public Object[][] browserDataProvider(){
		
			Object [][] broswerArray = new Object[2][2];
			
			broswerArray[1][0]= "chrome";
			broswerArray[1][1]= Platform.WIN10;
			
			broswerArray[0][0]= "firefox";
			broswerArray[0][1]= Platform.LINUX;
						
			broswerArray[0][0]= "chrome";
			broswerArray[0][1]= Platform.WIN10;
			
			return broswerArray;
			
			
			
		}
	

}

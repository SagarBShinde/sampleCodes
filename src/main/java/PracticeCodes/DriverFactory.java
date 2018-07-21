package PracticeCodes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	
	WebDriver D;
	
	public WebDriver getDriver(boolean gridExecution,String browser,String gridUrl,Platform P) throws MalformedURLException	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		if (gridExecution){
			
		switch (browser){
			
			case "firefox":
				
				cap = DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setPlatform(P);
				break;
							
			case "chrome":
			
				cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(P);
				break;
			
			default:
				//throw new RuntimeException("Unknow browsertype detectec");
				
		}
		
		D= new RemoteWebDriver(new URL(gridUrl+"/wd/hub"),cap);
		
						
		}else{
		
		switch (browser){
		
			case "firefox":
				
				D= new FirefoxDriver();
			
			case "chrome":
			
				System.setProperty("webdriver.chrome.path","./chromeDriver.exe" );
				D= new ChromeDriver();
				
			}
		}
		
		D.manage().window().maximize();
		return D;
		
	}

}

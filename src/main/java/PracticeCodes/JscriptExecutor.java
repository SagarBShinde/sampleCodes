package PracticeCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JscriptExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		
		WebDriver D= new ChromeDriver();
		D.navigate().to("https://www.google.com");	
		
		WebElement e= (WebElement) ((JavascriptExecutor)D).executeScript(" return document.getElementById('gbqfbb')","" );
		
		Actions testActions= new Actions(D);
		
		testActions.moveToElement(e).build().perform();
		
		WebElement f= D.findElement(By.xpath("//*[@class='gbqfba gbqfba-hvr']"));
		
		f.click();
		
		String curLabel= f.getAttribute("aria-label");
		
		testActions.moveToElement(e).build().perform();
		
		Thread.sleep(2000);
		
		testActions.moveToElement(D.findElement(By.xpath("//*[@class='gbqfba gbqfba-hvr']"))).build().perform();
			
	}
	
	
	

}

package PracticeCodes;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CarDekho {
	
	static WebDriver D;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		try{
		D= new DriverFactory().getDriver(false, "chrome", null, null);
		
		D.get("https://www.cardekho.com/");
		
		D.findElement(By.xpath("//input[@id='newCarByBrand']/following-sibling::span[1]")).click();
		
		Select S1= new Select(D.findElement(By.id("newCarBrandSelect")));
		
		S1.selectByValue("Mahindra");
		
		Thread.sleep(2000);
		
		S1= new Select(D.findElement(By.id("newCarModelSelect")));
		
		S1.selectByValue("Thar");
		
		
		Thread.sleep(1000);
		
	} finally{
		
		D.close();
		
		}
	
	}

}
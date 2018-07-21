package test.sagar.sample.sampleCodes;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class BrowserTesting1 {
	
	public static WebDriver D;
	
	@Test(groups={"real"}, enabled=false)
	public void browserTest() throws InterruptedException{
		
		
		
		System.setProperty("webdriver.chrome.path","./chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		D=  new ChromeDriver();
		
		D.manage().window().maximize();
		
		D.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		D.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebDriverWait expWait= new WebDriverWait(D,20);
		
		D.navigate().to("https://www.cardekho.com/");
		
		//expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'newCarByBrand')]")));
		
		Thread.sleep(5000);
		
		
		WebElement e= D.findElement(By.xpath("//input[contains(@id,'newCarByBrand')]"));
		
		//e.click();
		
		Actions act= new Actions(D);
		
		act.moveToElement(e).build().perform();
		act.click().build().perform();
		expWait.until(ExpectedConditions.attributeToBe(By.xpath("//*[@id='searchNewCarByBudgetDiv']"), "class", "disnone"));
		Select brandDropDown= new Select(D.findElement(By.name("newCarBrandSelect")));
		brandDropDown.selectByValue("Mahindra");
	   	Assert.assertTrue(e.isSelected());
    	Thread.sleep(5000);
		D.quit();
		
		
		
	}
	
	@Test(groups={"real"},enabled=false)
	public void browserTest2() throws InterruptedException{
		
		D= new ChromeDriver();
		
		D.manage().window().maximize();
		
		D.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait expWait= new WebDriverWait(D,20);
		
		D.get("https://www.cardekho.com/");
		
		Select priceDropDown= new Select (D.findElement(By.name("newCarBudgetSelect")));
		priceDropDown.selectByIndex(4);
		D.findElement(By.xpath("//*[text()='Search']")).click();
		
		expWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='matchingVar1']/ul")));
		
		WebElement unorderedList= D.findElement(By.xpath("//*[@id='matchingVar1']/ul"));
		
		WebElement e= D.findElement(By.xpath("//*[@id='matchingVar1']/ul/li[1]/following-sibling::li"));
		
		WebElement f= D.findElement(By.cssSelector("#matchingVar1>ul>li:nth-child(2)"));
		
		System.out.println(f.getText());
		System.out.println(e.getText());
		
		WebElement g= D.findElement(By.cssSelector("*[class^='btnuse']"));
		
		g.click();
		
		//JavascriptExecutor jse= ((JavascriptExecutor)D);
		
		//jse.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(5000);
		
		D.quit();		
	}
	
	@Test(groups={"real"})
	public void browserTest3() throws InterruptedException{
		
		D= new ChromeDriver();
		
		D.manage().window().maximize();
		
		D.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait expWait= new WebDriverWait(D,20);
		
		D.get("http://www.moneycontrol.com/mutualfundindia/");
	
		WebElement table1= D.findElement(By.cssSelector(".equityN>table"));
		
		//ArrayList<WebElement> rows= (ArrayList<WebElement>) D.findElements(By.xpath("//*[@class='equityN'"));
		//$x("(//*[@class='equityN'])[1]")
		
		((JavascriptExecutor) D).executeScript("arguments[0].scrollTop -= 20;", D.findElement(By.id("mfBox1")));
		
		Thread.sleep(5000);
		
		//System.out.println(rows.size());
		
	
		
	
	}
	
	
	
	
	
	@AfterClass	
	
	public void conclude(){
		
		D.quit();
	}
	
	

}




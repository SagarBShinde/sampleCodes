package TestGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PracticeCodes.DriverFactory;

public class GridTest2 {
	
	
@Test(dataProvider="browserDataProvider2")

public void testSalesforce1(String Browser, Platform P) throws MalformedURLException{
	
	try {
		System.out.println("BrowserName is:"+ Browser);
		System.out.println("Platform is:"+ P.getPartOfOsName());
		WebDriver D= (new DriverFactory()).getDriver(true,Browser,"http://192.168.0.103:4444",P);
		D.get("https://www.carwale.com/");
		D.findElement(By.id("newCarsList")).sendKeys("Jeep Compass");
		D.findElement(By.id("btnFindCarNew")).click();
		Thread.sleep(5000);
		D.quit();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@DataProvider
public Iterator<Object[]> browserDataProvider2(){
	
	List<Object[]> testDat= new ArrayList<Object[]>();
	Object [] data1 = new Object[2];
	data1[0]="chrome";
	data1[1]=Platform.WIN10;
	
	Object [] data2 = new Object[2];
	data2[0]="firefox";
	data2[1]=Platform.WIN10;
	
	testDat.add(data1);
	testDat.add(data2);
		
	return testDat.iterator();
	
	
	
}



}

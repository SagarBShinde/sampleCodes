package test.sagar.sample.sampleCodes;

import java.util.Set;

import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass1 {
	
//If dependancy is on the method of a diffrent class then a group has to be formed and dependancy has to formed on the group.	

	@BeforeTest
	public  void BforetestClass1Method2(ITestContext testContext){
		
		System.out.println("In test Class1 Method 2");
		testContext.setAttribute("Data", "Data is passed from Method 2");
		 
		
	}	
	
@Test(groups={"sanity"},dependsOnMethods = {"testClass1Method2"})
@Parameters("browser")
public  void testClass1Method1( String browser){
	
	System.out.println("In test Class1 Method 1");
	System.out.println("Parameter is:"+ browser);
	
	
}	

@Test(groups={"sanity"},dependsOnGroups = {"smoke"}, priority=1)
public  void testClass1Method2(ITestContext testContext){
	
	System.out.println("In test Class1 Method 2");
	testContext.setAttribute("Data2", "Data is passed from Method 2X");
	 
	
}

@Test(groups={"regression"})
public  void testClass1Method3(ITestContext testContext){
	
	System.out.println("In test Class1 Method 3");
	 String Data = (String) testContext.getAttribute("Data2");	
	 System.out.println(Data);
}

@Test(groups={"regression"})
public  void testClass1Method4(){	
	System.out.println("In test Class1 Method 4");
	
}

@Test(groups={"regression"})
public  void testClass1Method5(){
	
	System.out.println("In test Class1 Method 5");
	
}

	
	

}
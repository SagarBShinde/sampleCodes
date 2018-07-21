package test.sagar.sample.sampleCodes;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 {
	
	
	
@Test(groups={"smoke"})


public  void testClass2Method1(){
	
	System.out.println("In test Class2 Method 1");
	
	
}	

@Test(groups={"smoke"},threadPoolSize = 3, invocationCount = 10,  timeOut = 10000)
public  void testClass2Method2(){
	
	System.out.println("In test Class2 Method 2");
	
}

@Test(groups={"functional"},enabled=false)
public  void testClass2Method3(){
	
	System.out.println("In test Class2 Method 3");
	
}

@Test(groups={"functional"})
public  void testClass2Method4(ITestContext testContext){
	
	System.out.println("In test Class2Method 4");
	System.out.println((String) testContext.getAttribute("Data2"));
	
}

@Test(groups={"functional"})
public  void testClass2Method5(){
	
	throw new SkipException("Skipping - This is not ready for testing ");
	
}
	

//Robot robot = new Robot();

// Press keys using robot. A gap of
// of 500 mili seconds is added after
// every key press
//robot.keyPress(KeyEvent.VK_H);

}

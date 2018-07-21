package test.sagar.sample.sampleCodes;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class MainClass {

	public static void main(String[] args) {
		Dogs D= new Dogs();
		
		Animal A= new Dogs();
		
		Animal B= new Animal();
		
		TestNG myTNG= new TestNG();
		
		List<String> suites = Lists.newArrayList();
		suites.add(".\\testng.xml");
		myTNG.setTestSuites(suites);
		myTNG.run();
		
		
		
	}
	
	
	

}

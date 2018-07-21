package test.sagar.sample.sampleCodes;

import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNgTest {
	
	
@Test(dataProvider = "DataProviderforArrayList2", dataProviderClass = DataProviderTest.class)
 
public static void test1(List<String> s, String name, int k){

	System.out.println("This is first test.");
	
}
	

	
	

}

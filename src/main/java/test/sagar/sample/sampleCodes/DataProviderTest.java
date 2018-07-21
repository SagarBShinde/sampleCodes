package test.sagar.sample.sampleCodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
@DataProvider(name="DataProviderforArrayList")

public static Object[][] arrayListDP(){
	
	List<String> fruitList= new ArrayList<String>();
	fruitList.add("Mango");
	fruitList.add("Watermelon");
	fruitList.add("Chikoo");
	fruitList.add("Pineapple");
	fruitList.add("Cherry");
	
	List<String> carList = new ArrayList<String>();
	carList.add("XUV500");
	carList.add("Compass");
	carList.add("TUV300");
	carList.add("Swift");
	carList.add("Nexon");
	
	Object[][] myData = new Object[2][3];  
	
	// first dimension- row - no of iterations to be performed
	// second dimension- columns- no of test parameters accepted
	
	myData[0][0]= fruitList; 
	myData[0][1]= "fruitList";
	myData[0][2]= 0002;
	
	myData[1][0]= carList;
	myData[1][1]= "carList";
	myData[1][2]= 0005;
	
	return myData;
	
}

@DataProvider(name="DataProviderforArrayList2")

public static Iterator<Object[]> arrayListDP2(){
	// Single dimensional array with number of members equal to no of parameters test method accepts
	List<String> fruitList= new ArrayList<String>();
	fruitList.add("Mango");
	fruitList.add("Watermelon");
	fruitList.add("Chikoo");
	fruitList.add("Pineapple");
	fruitList.add("Cherry");
	
	List<String> carList = new ArrayList<String>();
	carList.add("XUV500");
	carList.add("Compass");
	carList.add("TUV300");
	carList.add("Swift");
	carList.add("Nexon");
	
	List<Object[]> mydata = new ArrayList<Object[]>();
	
	Object[] firstData = new Object[3];
	Object[] SecondData=new Object[3];
	
	firstData[0]= fruitList;
	firstData[1]= "fruitList";
	firstData[2]= 2;
	
	SecondData[0]= carList;
	SecondData[1]= "carList";
	SecondData[2]= 5;
	
	
	mydata.add(firstData);
	mydata.add(SecondData);
	
	return mydata.iterator();
	
	
	
	
}




}

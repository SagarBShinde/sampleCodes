package test.sagar.sample.sampleCodes;

import org.testng.reporters.jq.Main;

public class Dogs extends Animal {

	@Override
	public void eating(){
		
		System.out.println("dogs are eating");

		
	}
	
	public void barking(String voice){
		
		System.out.println("dogs are barking" + voice);
	
		
	}
	
	public static void main(String[] args) {
		
		Dogs Dog= new Dogs();
		
		Dog.setHorn("There are 2 horns");
		System.out.println(Dog.getHorn());
		 Dog.kissing();
		
		
	}
	
}

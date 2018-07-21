package test.sagar.sample.sampleCodes;

public class Animal implements beingLive {
	
	public static String legs; //Public static variable- Will not be available in SubClass
	public String mouth;		//Public Varaible- will be abailable in SubCLass
	private static String tail; //Private Static varibale will not be available in subclass and cannot be set using .operator on instance
	private  String horn;		//Private Static varibale will not be available in subclass and cannot be set using .operator on instance
	
	public void speaking(){
		
		System.out.println("Animal Also Speaks");
	}

	@Override
	public void  eating() {
		// TODO Auto-generated method stub
		System.out.println("Animal eating");
		
	}

	@Override
	public void breathing() {
		System.out.println("Animal breathing");
		
	}

	@Override
	public void mating() {
		System.out.println("Animal Mating");
		
	}

	@Override
	public void moving() {
		System.out.println("Animal Moving");
		
	}
	private void dancing(){
		
		System.out.println("Animal is dances in private");
	
		
	}
	
	public final void kissing(){
		
		System.out.println("Animal is finally kissing");
	}

	public String getHorn() {
		return horn;
	}

	public void setHorn(String horn) {
		this.horn = horn;
	}


	

}

package PracticeCodes;

public class Employee {
	
	private int Empid;
	private String EmpName;
	
	public Employee(int EmpId, String EmpName){
		this.Empid=EmpId;
		this.EmpName=EmpName;
			
		
	}

	public static void main(String[] args) {
		
		Employee E1= new Employee(1,"ABC");
		Employee E2= new Employee(1,"ABC");
		
		System.out.println(E1.equals(E2));

	}

}

package myComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private int EMPID;
	private String Name;
	
	public Employee(int EMPID, String Name){
		this.EMPID=EMPID;
		this.Name= Name;
	}
		
	
	public int getEMPID() {
		return EMPID;
	}
	public void setEMPID(int eMPID) {
		EMPID = eMPID;
		
	
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public int compareTo(Employee o) {
		return new Integer(EMPID).compareTo(o.getEMPID());
	}
	
	@Override
	public String toString(){
		
		return EMPID+":"+Name;
		
		
	}
	
	 static class CustomComparator implements  Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			int result= o1.compareTo(o2);
			
			if (result!=0)
				return result;
			
			else 
				return o1.getName().compareTo(o2.getName());
			
			}
			
		}
		
		
	 public static void main (String[] args){
		 
		 Employee emp1= new Employee (11,"LMN");
		 Employee emp2= new Employee (22,"PQR");
		 Employee emp3= new Employee (33,"PQR");
		 Employee emp4= new Employee (11,"DEF");
		 Employee emp5= new Employee (22,"ABC");
		 
		 ArrayList<Employee> empList = new ArrayList<Employee>();
		 
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3); 
		empList.add(emp4); 
		empList.add(emp5);
		
		Collections.sort(empList);
		
		System.out.println(Arrays.toString(empList.toArray()));
		
		CustomComparator custcompa= new CustomComparator();
		
		Collections.sort(empList, custcompa);
		 
		System.out.println(Arrays.toString(empList.toArray()));
	 }


}
	
	
	


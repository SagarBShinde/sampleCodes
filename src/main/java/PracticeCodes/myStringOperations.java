package PracticeCodes;

import java.util.Arrays;
import java.util.regex.Pattern;

public class myStringOperations {
	
	public static void main (String[] args){
		
		String s="Sagar";
		System.out.println(myStringOperations.isPalindrome(s));
		System.out.println(myStringOperations.reverseSentence("I am great coder"));
		
		
	}
	
	public static boolean isPalindrome(String s){
		
		for (int i=0;i<(s.length()/2);i++){
			
			System.out.println("Value of i is:"+i);
			System.out.println((i) +"th character is:"+s.charAt(i));
			if (s.charAt(i)==s.charAt(s.length()-i-1)){
				
				continue;
			}else
				return false;
				
			
		}
		return true;
			
	}
	
	public static String reverseSentence(String s){
		
		String[] sArray= s.split("\\s+");
		String[] reverseArray= new String[(sArray.length)];
		
		
		for (int i=0; i<sArray.length;i++){
		
			reverseArray[i]= sArray[sArray.length-i-1]+" ";
			
		}
		reverseArray[reverseArray.length-1]=reverseArray[reverseArray.length-1].trim();
		String reverseString= reverseArray.toString().trim();
		return Arrays.toString(reverseArray).replaceAll(",", "").trim();
		
		
		
		
	}

}

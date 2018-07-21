package PracticeCodes;

import java.util.Arrays;

public class Anaragram {
	
	
	public static boolean isAnaragram(String s1, String s2){
		
		if (s1.length()!=s2.length()){
			
			return false;
		}
		
		if (s1.equals(s2)){
			
			return true;
			
		}
		
		s1.replaceAll("\\s", "");
		s2.replaceAll("\\s", "");
		
		char [] s1Array= s1.toCharArray();
		char [] s2Array= s2.toCharArray();
		
		Arrays.sort(s2Array);
		Arrays.sort(s1Array);

		if (Arrays.equals(s1Array, s2Array)){
			
			return true;
		}
		
		return false;
		
		
		
		
	}

}

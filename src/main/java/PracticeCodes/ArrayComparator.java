package PracticeCodes;

import java.util.Arrays;

public class ArrayComparator {

	private static int[] myIntArray1 = {2,4,6,9,65};
	//private static int[] myIntArray2 = {1,3,4,11,65};
	private static int[] myIntArray2 = {5,9,68,69,70};
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(ArrayComparator.compareArray(myIntArray1, myIntArray2)));
		
		
	}
	
	private static int[] compareArray(int[] A, int[] B){
		int [] commonArray = new int[5];
		int k=0;
		
		for (int i=0; i< A.length;i++){
			System.out.println("Loop 2:"+ i);
			System.out.println("i:"+i+"A[i]:"+A[i]);
			
			for (int j=0; j< B.length; j++){
				System.out.println("Loop 1:"+ j);
				System.out.println("i:"+i+"B[j]:"+B[j]);
			
				if (A[i]==B[j]){
					System.out.println("match found");
					commonArray[k]=A[i];
					k++;
					
				}
				else{ 
					if(A[i]> B[j] && A[i]> B[B.length-1]) {
					System.out.println("break the loop");
					return commonArray;
					}
					if (A[i]< B[j])
						 break;
				}
				
			}
					
			
			}
		
		return commonArray;
		
	
	 }
	

}
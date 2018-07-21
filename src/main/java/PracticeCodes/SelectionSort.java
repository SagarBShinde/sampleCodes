package PracticeCodes;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a = new int[]{4,7,78,6,65,2};
		System.out.println(Arrays.toString(selectionSort(a)));
		
	}
	
	private static int[] selectionSort(int[] b){
		int temp;
		
		for(int j=0;j<= b.length-1;j++){
						
			for (int i=j;i< b.length;i++){
				System.out.println("b[" + j+"]:"+ b[j]+"----"+"b[" +i+"]:"+ b[i] );	
				if (b[j] >= b[i]){
					
					temp=b[j];
					b[j]=b[i];
					b[i]=temp;
				}
				else{
					continue;	
				}
				System.out.println(Arrays.toString(b));
			}
			
			System.out.println(Arrays.toString(b));
						
		}
		System.out.println(Arrays.toString(b));	
		return b;
			
	}

}

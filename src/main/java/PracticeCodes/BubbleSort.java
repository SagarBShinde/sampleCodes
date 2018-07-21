package PracticeCodes;

import java.util.Arrays;

public class BubbleSort {

	//private static int[] a= new int[]{4,5,3,6,9,14,11};
	private static int[] a= new int[]{5, 6, 9, 14, 11, 4, 3};
	
	public static void main(String[] args) {
	
	int i=0;
	int j=0;
	int temp;
	boolean swap=false;
	
	while(true){
		i=0;
		swap=false;
		System.out.println("Array is:"+ Arrays.toString(a));
		while(i < a.length-1){
			System.out.println("a[" + i+"]:"+ a[i]+"----"+"a[" +(i+1)+"]:"+ a[i+1] );
			if (a[i]<= a[i+1]){
			
				temp= a[i];
				a[i]=a[i+1] ;
				a[i+1]=temp;
				swap=true;
			}else{
				
				continue;
			}
			i=i+1;
			System.out.println("Array is:"+ Arrays.toString(a));
		}
				
		if (!swap){
			break;
		}	
		
		
		}
		System.out.println(Arrays.toString(a));
		
	}

}

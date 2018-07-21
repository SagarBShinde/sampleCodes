package sortingAlgos;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray= {4,5,6,2,1,7,10,3,8,9};

		Sort s = new Sort();
		
		//inputArray= s.selectionSort(inputArray);
		//inputArray= s.bubbleSort(inputArray);
		//inputArray= s.intertionSort(inputArray);
		//s.mergeSort(inputArray);
		s.quickSort(inputArray, 5);
		
		System.out.println(Arrays.toString(inputArray));
	
	
	}

}

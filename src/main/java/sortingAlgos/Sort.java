package sortingAlgos;

public class Sort {
	

	public int [] selectionSort(int[] input){
		
		int temp;
		for (int i=0; i< input.length; i++){
			
			for (int j=i; j< input.length; j++){
				
				if (input[i]> input[j]){
					
					Helper.swap(input, i, j);
										
				}
				else 
					continue;
			}
							
		}
				
		return input;
	}

	
	public int [] bubbleSort(int[] input){
		
		
		while(true){
			boolean swap=false;
			for (int i=0; i< input.length-1;i++){
			
				if (input[i] > input[i+1]){
				
				Helper.swap(input, i, i+1);
				swap=true;
								
				}
		
			}
		
			if (!swap)
				 break;
		}
		
		return input;
	
	}

	public int[] intertionSort(int[] input){
		
		for (int i=0;i< input.length-1;i++){
			
			for (int j=i+1; j>0; j--){
				
				if (input[j]< input[j-1]){
					Helper.swap(input, j, j-1);
				}
				else 
					break;
				
			}
						
		}
		
		return input;
			
	}
	
	public void mergeSort(int [] input){
		
		if (input.length==1)
			return;
		
		int spiltIndex= input.length/2 + input.length % 2;
		
		int[] firstList= new int[spiltIndex];
		int[] secondList= new int[input.length-spiltIndex];
		
		Helper.spilt(input, firstList, secondList);
		
		mergeSort(firstList);
		mergeSort(secondList);
		
		Helper.merge(input, firstList, secondList);
		Helper.printArray(input);
	}

	public void quickSort(int[] input, int pivot){
		
		pivot= input.length;
		
		while(pivot> 0){
		pivot= pivot/2;
		pivot = Helper.partition(input, pivot);
		System.out.println(pivot);
		quickSort(input,pivot);
		quickSort(input,input.length-pivot);
		
		}
	
	}
	
	
	
	
	
	
}	
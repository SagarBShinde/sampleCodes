package sortingAlgos;

import java.util.Arrays;

public class Helper {

		public static void swap (int [] testArray ,int i, int j){
			 int temp;
			 
			 temp= testArray[i];
			 testArray[i]=testArray[j];
			 testArray[j]=temp;
		}

		
		public static void printArray(int [] testArray){
			
			System.out.println(Arrays.toString(testArray));
			
		}
		
		public static void spilt(int[] listToSpilt, int[] firstList, int[] secondList ){
			
			int index=0;
			
			for (int elements: listToSpilt){
				
				if(index < firstList.length){
					
					firstList[index]=listToSpilt[index];
				}
					else {
						secondList[index-firstList.length]=listToSpilt[index];
					}
				index ++;
				}
				
			}
			
		
		public static void merge (int [] mergedList,int[] firstList, int [] secondList){
			
			int mergedListIndex=0;
			int firstListIndex=0;
			int secondListIndex=0;
			
			//Check the smaller element from the two list while first and second index are still less than lengths of the respective lists
			
			while(firstListIndex < firstList.length && secondListIndex< secondList.length ){
				
				if (firstList[firstListIndex] < secondList[secondListIndex]){
					mergedList[mergedListIndex]=firstList[firstListIndex];
					firstListIndex++;		
					
				}else{
					mergedList[mergedListIndex]=secondList[secondListIndex];
					secondListIndex++;
				}
				mergedListIndex++;			
			}
			
			if(firstListIndex < firstList.length){
				while (firstListIndex < firstList.length)
				mergedList[mergedListIndex++]=firstList[firstListIndex++];
				
			}  
			
			if(secondListIndex < secondList.length){
				while (secondListIndex < secondList.length)
				mergedList[mergedListIndex++]=secondList[secondListIndex++];
			}
			
		}
		
		
		public static int partition(int [] input, int pivotPos){
			
			int i=0;
			Helper.printArray(input);
			System.out.println("Value of pivotPos:"+ pivotPos+ " element Value :"+ input[pivotPos]);
			Helper.swap(input, pivotPos, input.length);
			
			int j = input.length-2;
			Helper.printArray(input);
			System.out.println("After Change:"+ pivotPos+ " element Value :"+ input[pivotPos]);
			
			while(i<j){
				
					while (input[i]< input[input.length-1] && i < pivotPos){
					
						System.out.println("Value of i:"+ i+" element Value :"+  input[i]);
						
						i++;
					}
					while (input[j]> input[input.length-1] && j > pivotPos){
						System.out.println("Value of j:"+ j+" element Value :"+ input[j]);
						j--;
					}
					
					if(i<j){
						
						Helper.swap(input, i, j);
						
					}
					
				}
			
				Helper.swap(input, input.length-1,j+1 );
				return j+1;
					
		}
			
					
	}


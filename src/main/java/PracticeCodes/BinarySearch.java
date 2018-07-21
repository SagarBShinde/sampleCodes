package PracticeCodes;

public class BinarySearch {
	 
    public int binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
        BinarySearch mbs = new BinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
        int [] a={2, 13, 17, 30, 45};;
        int [] b={1, 12, 15, 26, 38};
        
        System.out.println("Median is:"+findMedian(a,b));
    }
    
    public static int findMedian(int [] a, int[] b){
		
    	int m1=0;
    	int m2=0;
    	int k=0;
    	int l=0;
    	for (int i=0; i<a.length+1;i++){
    		
    		if (a[k]< b[l]){
    			
    			m1=m2;
    			m2=a[k];
    			l++;
    		}else{
    			
    			m1=m2;
    			m2=b[l];
    			k++;
    		}
    		
    	}
    	return (m1+m2)/2;
    	  	
    }
}
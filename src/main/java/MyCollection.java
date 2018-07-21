import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyCollection {

	static Set<String> Set1= new HashSet<String>();
	static Map<String,String> Map1 = new HashMap<String,String>();
	static List<String> list1 = new ArrayList<String>();
	
	public static void main(String[] args) {
		
	Set1.add("Test");
	Set1.add("Test1");
	Set1.add("Test2");
		
	for (String myVal: Set1){
		System.out.println("Value is:"+ myVal);
		
	}
		
	Map1.put("Key1", "Value1");
	Map1.put("Key2", "Value2");
	Map1.put("Key3", "Value1");
	
	System.out.println(Map1.get("Key1"));
	
	Iterator<Entry<String, String>> mapItr= Map1.entrySet().iterator();
	
	while (mapItr.hasNext()) {
	    Map.Entry<String, String> pair = mapItr.next();
	    String i = pair.getKey() + pair.getValue();
	    System.out.println(i);
	}
	
	list1.add("Kaju Curry");
	list1.add("Masala Dosa");
	list1.add("Mac Veggie");
	
	System.out.println(list1.get(0));
	System.out.println(list1.get(1));
	System.out.println(list1.get(2));
	
	System.out.println(Arrays.toString(sort(new int[]{4,6,2,3,9})));
	
	
	}
	
	static int[] sort(int arr[])
	{
	    int n = arr.length;
	 
	    for (int i = 0; i < n-1; i++)
	    {
	        int min_ind = i;
	        for (int j = i+1; j < n; j++){
	            if (arr[j] <= arr[min_ind])
	                min_ind = j;
	        }
	        // Swap the found minimum element with the first element
	        if(min_ind!=i)
	        {
	            int temp = arr[min_ind];
	            arr[min_ind] = arr[i];
	            arr[i] = temp;
	        }
	    }
		return arr;
	}
		 
		 


 }	
	


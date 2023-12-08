package Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateElements {
public static void main(String[] args) {	
//	List<Integer> list = Arrays.asList(1,2,3,4,3,8,5);
//	Set <Integer> set = new HashSet<>();
//	list.stream().filter(n->!set.add(n)).count();
//	System.out.println(set);
//	
	
//	
//	int arr[] = {1,1,2,3,4,4,5};
//	
//	int count =0;
//	
//	for(int i =0;i<7;i++) {
//		
//		if()
//	}
	
//	int arr[] = new int[]{1,1,2,2,3,3,4,4,6,7,4};
//	
//	for(int  i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]== arr[j]) {
//				System.out.println(arr[j]);
//			}
//			
//		}
//	}
	  int i1 = 234124567;
	  String str = Integer.toString(i1);
	    int i,length;
		int counter[] = new int[256] ;


		length = str.length();

		for(i=0 ; i<length ; i++)
		{
			counter[ (int) str.charAt(i) ]++;
		}

		for( i=0 ; i<256 ; i++)
		{
			if(counter[i] != 0)
			{
				System.out.println( (char)i + " - "+counter[i]);
			}
		}	

	
//	  public static void main(String[] args) {      
//          
//	        //Initialize array   
//	        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
//	          
//	        System.out.println("Duplicate elements in given array: ");  
//	        //Searches for duplicate element  
//	        for(int i = 0; i < arr.length; i++) {  
//	            for(int j = i + 1; j < arr.length; j++) {  
//	                if(arr[i] == arr[j])  
//	                    System.out.println(arr[j]);  
//	            }  
//	        }  
//	    }  
//	
	
}

}

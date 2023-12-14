package StringManipulation;

import java.util.Arrays;

public class ThirdHighestNumberFromArray {
	
	
	public static int ThirdHighestNumberFromArray(int[] i,int total) {
	
		Arrays.sort(i);
		return i[total-3];
	}

	public static void main(String[] args) {
		int a[] = {12,43,54,65};
		
		
		System.out.println(ThirdHighestNumberFromArray(a,4));
	}
}

class secondhighestnumber {
    
    
    
    public static int secondhighestnumber(int[] n,int total){
        Arrays.sort(n);
      return n[total-2];
    }
    public static void main(String[] args) {
    
    int arr1[]= {2,32,12,34,54};
    
    System.out.println(secondhighestnumber(arr1,5));
   }
}

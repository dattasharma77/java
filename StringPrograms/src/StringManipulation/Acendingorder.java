package StringManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Acendingorder {
	public static void main(String[] args) {
		
	int arr[]  = new int [] {1,3,2,4,55,4};
	
	int temp =0;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	System.out.println();
	
	
	
	
	for(int i :arr) {
		System.out.println(i);
	}
}}

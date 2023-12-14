package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



		public class SquaringPrimes {

			 

		    public static void main(String[] args) {
		        List<Integer> l1 = Arrays.asList(3,4,632,5,2,3,5,6);
		        List<Integer> l2=l1.stream().filter(SquaringPrimes::isPrime).map(e->e*e).collect(Collectors.toList());
		        System.out.println(l2);
		    
		 

		    }
		    public static boolean isPrime(int number) {
		        for (int i = 2; i <= number / 2; i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }

		 

		
		}
	
	
package StringManipulation;

import java.util.Scanner;

public class EvenorOdd {

	
	public static void main(String[] args) {
		
		int number=0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("it is even number");
		}
		else {
			System.out.println("odd numnber");
		}
	}
}

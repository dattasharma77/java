package StringManipulation;

import java.util.Scanner;

public class PrimeNumber {

	
public static void main(String[] args) {
	int flag = 0;
	int number =0;
	Scanner sc = new Scanner(System.in);
	number = sc.nextInt();
	
	if(number ==0|| number ==1) {
		System.out.println(number + "not a prime");
	}
	
	else {
		int middlenumber = number/2;
		for (int i=2;i<middlenumber;i++) {
			if(number%i==0) {
				System.out.println("not a prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("prime");
		}
	}
	
}
}

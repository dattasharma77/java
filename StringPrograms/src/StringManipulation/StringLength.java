package StringManipulation;

import java.util.Scanner;

public class StringLength {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String input = scanner.nextLine();
		int length = input.length();
		System.out.println(length);
	}

}

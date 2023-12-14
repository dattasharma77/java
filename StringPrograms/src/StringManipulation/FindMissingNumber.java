 package StringManipulation;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {
		
	
	List <Integer> numbers = new ArrayList<Integer>();
	
	
	numbers.add(1);
	numbers.add(2);
	numbers.add(4);
	numbers.add(5);
	numbers.add(6);
	}
	public static int findMissingNumber(List<Integer> numbers) {
  int n = numbers.size()+1;
  int totalsum = (n=(n*n-1)/2);   

int actualSum = 0;
for (int num : numbers) {
    actualSum += num;
}

return totalsum - actualSum;
}
}
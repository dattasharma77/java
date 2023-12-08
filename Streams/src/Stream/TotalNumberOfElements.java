package Stream;

import java.util.Arrays;
import java.util.List;

public class TotalNumberOfElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,5,1,9);
		long count =list.stream().count();
		System.out.println(count);
	}
}

package Stream;

import java.util.Arrays;
import java.util.List;

public class FindFirstUsingStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,1,6,4,7);
		
		list.stream().findFirst().ifPresent(System.out::println);
		
	}

}

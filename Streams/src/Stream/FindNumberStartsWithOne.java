package Stream;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartsWithOne {

	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,43,13,15,16);
		list.stream().map(s->s+"").filter(s-> s.startsWith("1")).forEach(System.out::println);
	}
}

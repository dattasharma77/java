package Stream;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,2,4,5,6);
		
		list.stream().filter(n-> n%2!=0).forEach(System.out::println);
	}

}

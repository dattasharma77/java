package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class findMaxElement {
	
public static void main(String[] args) {
	List<Integer> list =  Arrays.asList(1,22,1,44,33,98,89);
	Integer max = list.stream().max(Integer::compare).get();
	System.out.println(max);
	Optional<Integer> add = list.stream().reduce((a,b)->(a+b));
	System.out.println(add);
double average = list.stream().mapToInt(n->n).average().getAsDouble();
System.out.println(average);
}
}

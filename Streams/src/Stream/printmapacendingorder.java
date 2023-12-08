package Stream;

import java.util.HashMap;
import java.util.Map;

public class printmapacendingorder {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(3, "datta");
		map.put(1, "sharma");
		map.put(2, "zayn");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}

}

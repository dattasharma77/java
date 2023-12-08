package Stream;

import java.util.HashMap;
import java.util.Map;

public class PrintMapDecendingOrder {
	public static void main(String[] args) {
		
	
    Map <Integer,String> map = new HashMap<>();
    
    map.put(1, "datta");
    map.put(2, "pavan");
    map.put(3, "zayn");
    
   for(Map.Entry e : map.entrySet()) {
	   System.out.println(e);
   }

}}


 
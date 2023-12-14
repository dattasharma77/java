package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class Occurrenceofeverycharacterinstring {
public static void main(String[] args) {
	

	
	String str = "datta sharma";

	Map<Character,Integer> map = new HashMap<>();
	char[] ch = str.toCharArray();
	
	for (char chars : ch) {
		
		if(!map.containsKey(chars)) {
			map.put(chars, 1);                
	}
		else {
			int value = map.get(chars);
			map.put(chars, value+1);
		}
	}
	System.out.println(map);
}


public class countLetters {
	public static void main(String args[]) {

 

	    String str = "aaabbbcccdd";
	    int i;
	    int length;
		int counter[] = new int[256] ;



		for(i=0 ; i<str.length() ; i++)
		{
			counter[ (int) str.charAt(i) ]++;
		}

		for( i=0 ; i<256 ; i++)
		{
			if(counter[i] != 0)
			{
				System.out.println( (char)i + " - "+counter[i]);
			}
		}	
	}
}
}
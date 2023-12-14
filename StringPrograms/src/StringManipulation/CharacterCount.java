package StringManipulation;

public class CharacterCount {
	
	public static void main(String[] args) {
		String a = "datta pavan";
		char ch= 'a';
		
		int count = 0;
		
		for (int i=0;i<a.length();i++) {
			
			if(a.charAt(i)==ch) {
				
				count++;
			}
		}
		
		
		
		System.out.println(ch+""+count);
		
		
	}

	
	
	
		
		
		
}



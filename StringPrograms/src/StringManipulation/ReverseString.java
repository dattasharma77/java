package StringManipulation;

public class ReverseString {

	
//	public static void main(String[] args) {
//		String str = "dattapavan";
//		String reverse = new StringBuffer(str).reverse().toString();
//		
//		System.out.println(reverse);
//	}
	
	
	public static void main(String[] args) {
		
		
		String str ="shubham sangwan";
	

		 String reversed ="";

		 for(int i = str.length()- 1;i>=0;i-- ) {
			 
			 reversed = reversed +str.charAt(i);
			
			 
		 }

		
		 System.out.println(reversed);
		
		
	}
	
	
	}

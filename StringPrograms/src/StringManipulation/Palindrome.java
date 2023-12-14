package StringManipulation;

public class Palindrome {
	
	public static void main(String[] args) {
		String str = "madam";
		
		StringBuilder stringBuilder = new StringBuilder(str);
		String reversed = stringBuilder.reverse().toString();
	//	boolean ispalindrome = true;
		
//		for(int i =0;i<str.length()/2;i++) {
//			if(str.charAt(i)!= str.charAt(str.length()-i-1)) {
//				ispalindrome = false;
//				break;
//			}
			if (str.equals(reversed)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
		}
	}
	



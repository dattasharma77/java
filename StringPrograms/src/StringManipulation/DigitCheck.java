package StringManipulation;

public class DigitCheck {
	
	public static void main(String[] args) {
		String str ="12345";
		boolean isdigit =true;
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {
				isdigit = false;
				break ;
			}
			
			if(isdigit) {
				System.out.println("contains only digits");
			}
			else {
				System.out.println("contains non digits");
			}
		}
		
		
	}
	}



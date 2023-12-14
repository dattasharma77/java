package StringManipulation;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int num =10; int num1=0;int num2=1;
		int nextnum=0;
		for(int i=0;i<num;i++) {
			
			 nextnum = num1+num2;
			 num1=num2;
			 num2=nextnum;
			 System.out.println(nextnum);
			
			
		}
	}

}


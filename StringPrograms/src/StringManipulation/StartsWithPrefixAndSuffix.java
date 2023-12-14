package StringManipulation;

public class StartsWithPrefixAndSuffix {

	public static void main(String[] args) {
		
	
	
	String str1 = "datta"+"sharma";
	String prefix ="datta";
	String suffix = "shar";
	boolean startswith = str1.startsWith(prefix);
	boolean endswith =str1.endsWith(suffix);
	
	System.out.println(startswith);
	System.out.println(endswith);
}
}
package StringManipulation;

public class VowelCount {

    public static void main(String[] args) {
        String str = "datta sharma";
        int vowelcount = 0;
        int consonantcount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelcount++;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                consonantcount++;
            }
        }

        System.out.println("vowel count: " + vowelcount);
        System.out.println("consonant count: " + consonantcount);
    }
}





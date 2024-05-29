import java.util.Arrays;

public class TestRunner2 {

    //to determine if str1 and str2 are anagrams of each other.
    public static boolean areAnagrams(String str1, String str2) {
        // Write your code here
        if(str1==null||str2==null)
            return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length()!=str2.length())
            return false;
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
        
    }
    //A string is considered to be a valid hexadecimal if it only contains digits (0-9) and letters A-F (case-insensitive).
    //The isHexadecimalChar(char ch) method should return true if the character is a valid hexadecimal character (A-F or a-f) and false otherwise.
    public static boolean isHexadecimalChar(char ch) {
        // Write your code here
        if((ch>='a'&&ch<='f')||(ch>='A'&&ch<='F'))
            return true;
        return false;

    }

    //The isHexadecimal() method should return true if the string str is a valid hexadecimal string and false otherwise.
    public static boolean isHexadecimal(String str) {
        // Write your code here
        if(str==null||str.equals(""))
            return false;
        char[] charArrayHex = str.toCharArray();
        
        for (char c : charArrayHex) {
            if(!Character.isDigit(c) && !isHexadecimalChar(c))
                return false;
        }
        return true;
    }

    public String reverseWordsInSentence(String sentence) {
    
        if(sentence==null)
            return "INVALID";

        if(sentence.isBlank())
            return sentence;

        StringBuilder reveredSentence = new StringBuilder();

        for(String word:sentence.split(" ")){
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reveredSentence.append(reversedWord).append(" ");
        }
        
        return reveredSentence.toString().trim();
            
    }

    public static void main(String[] args) {
        //Method areAnagrams
        String str1 = "String ";
        StringBuilder stringBuilder = new StringBuilder("string");
        stringBuilder.reverse();
        System.out.print(str1.trim());
        System.out.println(stringBuilder);
        // String str2 = null;
        // boolean val = areAnagrams(str1,str2);
        // System.out.println(val);

        //Method isHexadecimal
        boolean val = isHexadecimal("A");
        System.out.println(val);

        
    }
    
}
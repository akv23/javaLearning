package JavaLearning.oops;

public class MyChar {

    // Private Variable
    private char ch;

    // Default constuctor
    public MyChar() {
        this('0');
    }

    // Parameter constuctor
    public MyChar(char c) {
        this.ch = c;
    }

    // Vowel check method
    public boolean isVowel() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U')
            return true;
        return false;
    }

    // Digit check method
    public boolean isDigit() {
        if (ch >= 48 && ch <= 57) // between '0' and '9'
            return true;
        return false;
    }

    // Alphabet check method
    public boolean isAlphabet() {
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) // between 'a' and 'z' or 'A' and 'Z'
            return true;
        return false;
    }

    // Convert lower case to upper case method
    public static void printUpperCaseAlphabet() {
        for (int i = 0; i < 26; i++)
            System.out.println((char) (65 + i));
    }

    // Convert upper case to lower case method
    public static void printLowerCaseAlphabet() {
        for (int i = 0; i < 26; i++)
            System.out.println((char) (97 + i));
    }

    // Consoant chek method
    public boolean isConsoant() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U')
            return false;
        return true;
    }

}

public class StringRunner {
    public static void main(String[] args) {
        String someString = "This is a lot of text again";
        printString(someString);
    }

    private static void printString(String someString) {
        for (int i = 0; i < someString.length(); i++) {
            System.out.println(someString.charAt(i));
        }
    }

}

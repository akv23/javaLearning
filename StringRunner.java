public class StringRunner {
    public static void main(String[] args) {
        // String someString = "This is a lot of text again";
        // printString(someString);
        String[] weekString = { "Sunday", "Monday", "Tuseday", "Wednesday", "Thrusday", "Friday", "Saturday" };
        String longestString = findLongestString(weekString);
        System.out.println("Longest String : " + longestString);
        printWeekDaysBackwards(weekString);
    }

    private static void printWeekDaysBackwards(String[] weekString) {
        for (int i = weekString.length - 1; i >= 0; i--) {
            System.out.println(weekString[i]);
        }
    }

    private static String findLongestString(String[] weekString) {
        String longestString = "";
        for (String string : weekString) {
            if (string.length() > longestString.length()) {
                longestString = string;
            }
        }
        return longestString;
    }

    @SuppressWarnings("unused")
    private static void printString(String someString) {
        for (int i = 0; i < someString.length(); i++) {
            System.out.println(someString.charAt(i));
        }
    }
    

}

public class TestRunner {
    public static void main(String[] args) {
        String str = "";
        System.out.println(findLongestWord(str));
    }

    private static String findLongestWord(String str) {
        String[] word = str.split(" ");
        int maxLength = 0;
        String longestWord = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > maxLength) {
                maxLength = word[i].length();
                longestWord = word[i];
            }
        }
        return longestWord;
    }
}

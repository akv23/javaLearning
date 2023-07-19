import JavaLearning.oops.MyChar;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('a');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isConsoant());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());
        MyChar.printLowerCaseAlphabet();
        MyChar.printUpperCaseAlphabet();
    }
}

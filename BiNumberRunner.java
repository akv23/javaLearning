import JavaLearning.oops.BiNumber;

public class BiNumberRunner {

    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2, 3);
        System.out.println(numbers.addition());
        System.out.println(numbers.multiply());
        numbers.doubleNumber();
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());
    }
}
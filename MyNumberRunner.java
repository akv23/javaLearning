import JavaLearning.oops.MyNumber;

public class MyNumberRunner {

    public static void main(String[] args) {
        MyNumber number = new MyNumber(10);
        System.out.println("isPrime : " + number.isPrime());
        int sum = number.sumUptoN();
        int sumOfDivisors = number.sumOfDivisors();
        System.out.println(sum);
        System.out.println(sumOfDivisors);
        number.printANumberTriangle();
    }
}

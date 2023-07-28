package JavaLearning.oops;

public class MyNumber {

    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public MyNumber() {
        this(0);
    }

    public boolean isPrime() {
        boolean flag = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sumOfDivisors = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors;
    }

    public void printANumberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

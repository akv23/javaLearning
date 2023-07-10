package JavaLearning.oops;

public class BiNumber {

    // Private Variable
    private int num1;
    private int num2;

    // Default constuctor
    public BiNumber() {
        this(0, 0);
    }

    // Parameter Constructor
    public BiNumber(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Addition Method
    public int addition() {
        return num1 + num2;
    }

    // Subtraction Method
    public int subtraction() {
        return num2 - num1;
    }

    // Multiply Method
    public int multiply() {
        return num1 * num2;
    }

    // Double Method
    public void doubleNumber() {
        this.num1 *= 2;
        this.num2 *= 2;
    }

    // Get Number 1
    public int getNumber1() {
        return num1;
    }

    // Get Number 2
    public int getNumber2() {
        return num2;
    }

}

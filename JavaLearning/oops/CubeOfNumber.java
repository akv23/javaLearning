package JavaLearning.oops;

public class CubeOfNumber {

    private int number;

    public CubeOfNumber(int number) {
        this.number = number;
    }

    public CubeOfNumber() {
        this(0);
    }

    public void printCube() {
        System.out.println("Cube is :" + (number * number * number));
    }

}

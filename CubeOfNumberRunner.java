import java.util.Scanner;

import JavaLearning.oops.CubeOfNumber;

public class CubeOfNumberRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.println("To get cube of number");
        do {
            CubeOfNumber cube = new CubeOfNumber(number);
            cube.printCube();
            System.out.print("Enter the number :");
            number = scanner.nextInt();
        } while (number >= 0);
        System.out.println("Thank You! Have Fun");

    }
}

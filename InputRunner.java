import java.util.Scanner;

public class InputRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Number 2 : ");
        int number2 = scanner.nextInt();

        System.out.println("Choices Available are");
        System.out.println("1-Add");
        System.out.println("2-Subtract");
        System.out.println("3-Divide");
        System.out.println("4-Multiply");

        System.out.println("Enter operation: ");
        int choice = scanner.nextInt();

        System.out.println("Your Choices");
        System.out.println("Number 1:" + number1);
        System.out.println("Number 2:" + number2);
        System.out.println("Operation :" + choice);

        switch (choice) {
            case 1:
                System.out.println("Add of number 1 and number 2 :" + (number1 + number2));
                break;
            case 2:
                System.out.println("Subtract of number 1 and number 2 :" + (number1 - number2));
                break;
            case 3:
                System.out.println("Divide of number 1 and number 2 :" + (number1 / number2));
                break;
            case 4:
                System.out.println("Multiply of number 1 and number 2 :" + (number1 * number2));
                break;
            default:
                System.out.println("You have not entered correct value");
                break;
        }

    }
}

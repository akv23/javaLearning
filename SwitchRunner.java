import java.util.Scanner;

public class SwitchRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check is a week day");
        System.out.println("Enter value between 0 to 6:");
        int dayNumber = scanner.nextInt();
        if (isWeekDay(dayNumber)) {
            System.out.println("Its a Week Day");
        } else {
            System.out.println("Its a Week End");
        }
        System.out.println(determineNameOfDay(dayNumber));
        System.out.println("Enter the number of a month : ");
        int monthNumber = scanner.nextInt();
        System.out.println(determineNameOfmonth(monthNumber));
        scanner.close();

    }

    private static String determineNameOfmonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
            default:
                return "Enter valid value";
        }
    }

    private static String determineNameOfDay(int dayNumber) {
        switch (dayNumber) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuseday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thrusday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Enter valid value";
        }

    }

    private static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return false;

        }
        return false;
    }
    
}

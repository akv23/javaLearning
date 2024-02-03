import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2004));
        // String str = "";
        // System.out.println(findLongestWord(str));
        // System.out.println(isPerfectNumber(0));
        // int[] array = { 5, 4, 3, 2, 1 };
        // System.out.println(doesHaveElementGreaterThan(array, 7));
        // System.out.println(findSecondLargestElement(array));
        // int[] newArray = reverseArray(array);
        // List<Integer> newArray = determineAllFactors(12);
        List<Integer> newArray = determineMultiples(0, 7);
        for (int i : newArray) {
            System.out.println(i);
        }
    }

    public static List<Integer> determineMultiples(int number, int limit) {
        List<Integer> list = new ArrayList<Integer>();
        boolean flag = true;
        int i = 1;
        if (number > limit) {
            return list;
        } else {
            while (flag) {
                if (i * number < limit)
                    list.add(i * number);
                else
                    flag = false;
                i++;
            }
            return list;
        }
    }

    public static List<Integer> determineAllFactors(int number) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                list.add(i);
        }
        return list;
    }

    public static int[] reverseArray(int[] array) {
        int len = array.length;
        if (len <= 1)
            return array;
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
        return array;
    }

    public static boolean doesHaveElementGreaterThan(int[] array, int number) {
        if (array.length <= 0)
            return false;
        for (int i : array) {
            if (i > number)
                return true;
        }
        return false;
    }

    public static int findSecondLargestElement(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean flag = false;
        if (array.length <= 1)
            return -1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1])
                flag = true;
            else {
                flag = false;
                break;
            }
        }

        if (flag)
            return -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            }
            if (array[i] > secondLargest && array[i] < firstLargest)
                secondLargest = array[i];
        }

        return secondLargest;
    }

    public static boolean isLeapYear(int year) {
        boolean flag = false;
        if (year <= 0)
            flag = false;
        if (year / 4 == 0)
            flag = true;
        if (year / 4 == 0 && year / 100 != 0) {
            flag = true;
        }
        if (year / 4 == 0 && year / 400 == 0) {
            flag = true;
        }
        return flag;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number <= 0)
            return false;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
        if (sum == number)
            return true;
        else
            return false;
    }

}

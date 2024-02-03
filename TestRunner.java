public class TestRunner {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2004));
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

}

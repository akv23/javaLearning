package JavaLearning.FunctionalPrograms;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        getNumbers(numbers);
        int sum = fpSum(numbers);
        // int sum = getSum(numbers);
        System.out.println(sum);
    }

    private static Integer fpSum(List<Integer> numbers) {
        return numbers.stream()
            .reduce(0, (number1,number2) -> number1+number2);
    }

    private static void getNumbers(List<Integer> numbers) {
        numbers.stream()
            .forEach(element -> System.out.println(element));
    }

    private static int getSum(List<Integer> numbers) {
        int sum =0;
        for (int number : numbers) {
            sum+=number;
        }
        return sum;
    }
}

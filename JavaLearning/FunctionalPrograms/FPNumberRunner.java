package JavaLearning.FunctionalPrograms;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        // numbers.stream()
        //     .forEach(element -> System.out.println(element));
        int sum = numbers.stream()
            .filter(element -> element%2==0)
            .reduce(0, (number1,number2) -> number1+number2);
        // int sum = getSum(numbers);
        System.out.println(sum);
    }

    private static int getSum(List<Integer> numbers) {
        int sum =0;
        for (int number : numbers) {
            sum+=number;
        }
        return sum;
    }
}
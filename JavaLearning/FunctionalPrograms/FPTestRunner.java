package JavaLearning.FunctionalPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FPTestRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list = numbers.stream().filter(FPTestRunner::isOdd).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);
    }

    public static boolean isOdd(Integer number){
        return number%2==1;
    }
    public static void systemPrint(Integer num){
        System.out.println(num);
    }

}

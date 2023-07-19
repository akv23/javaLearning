import java.math.BigDecimal;

import JavaLearning.oops.SimpleInterestCalaulator;

public class SimpleIntersetCalculatorRunner {

    public static void main(String[] args) {

        SimpleInterestCalaulator calculator = new SimpleInterestCalaulator("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }

}

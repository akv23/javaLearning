package JavaLearning.oops;

import java.math.BigDecimal;

/**
 * SimpleInterestCalaulator
 */
public class SimpleInterestCalaulator {

    private BigDecimal principal;
    private BigDecimal interest;

    public SimpleInterestCalaulator() {
        this("0.0", "0.0");
    }

    public SimpleInterestCalaulator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal("100"));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        return principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
    }

}
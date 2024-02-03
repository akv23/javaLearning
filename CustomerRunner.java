import JavaLearning.oops.Address;
import JavaLearning.oops.Customer;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address();
        Customer customer = new Customer("abc",homeAddress);
        System.out.println(customer);
        Address workAddress = new Address("Work Line 1", "City of Work", 987098);
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
    
}
package JavaLearning.oops;

public class Address {
    private String address1;
    private String city;
    private int postalCode;

    public Address(){
        this("address1", "city", 123456);
    }

    public Address(String address1,String city,int postalCode){
        this.address1=address1;
        this.city=city;
        this.postalCode=postalCode;
    }
    public String toString(){
        return String.format("Address1 = %s, City = %s, Postal Code = %d", address1,city,postalCode);
    }
}

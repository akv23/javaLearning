package JavaLearning.oops;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;

    public Customer(String name,Address homeAddress){
        this.name=name;
        this.homeAddress=homeAddress;
    }

    public void setHomeAddress(Address homeAddress){
        this.homeAddress=homeAddress;
    }
    public Address getHomeAddress(){
        return homeAddress;
    }

    public void setWorkAddress(Address workAddress){
        this.workAddress=workAddress;
    }
    public Address getWorkAddress(){
        return workAddress;
    }
    @Override
    public String toString(){
        return ("Name : "+name + "\nHome Address : \n"+getHomeAddress()+"\nWork Address : \n"+getWorkAddress());
    }
}

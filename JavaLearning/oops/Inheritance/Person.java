package JavaLearning.oops.Inheritance;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public Person(){
        this("name", "email", "phoneNumber");
        System.out.println("Person Constructor");
    }
    public Person(String name,String email,String phoneNumber){
        this.email=email;
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail() {
        return email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString() {
        return String.format("Name : %s,\nEmail : %s,\nPhone Number : %s",name,email,phoneNumber);
    }
}

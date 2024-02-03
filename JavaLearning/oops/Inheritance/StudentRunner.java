package JavaLearning.oops.Inheritance;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("ABC", 2020);
        student.setName("Name");
        student.setEmail("name@gmail.com");
        student.setPhoneNumber("9870988768");
        System.out.println(student);
    }
}

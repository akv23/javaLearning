package JavaLearning.JavaGenerics;

public class MyCustomGenericRunner {
    public static void main(String[] args) {
        MyCustomGeneric<String> myCustomGeneric = new MyCustomGeneric<>();
        myCustomGeneric.addElement("aman");
        System.out.println(myCustomGeneric);
    }
}

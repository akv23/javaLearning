package JavaLearning.oops.Interface;

public class Project {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyAlgorithm();
        System.out.println(algorithm.complexAlgorithm(20, 10));
    }
}

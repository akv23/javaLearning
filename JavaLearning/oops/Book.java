package JavaLearning.oops;

public class Book {
    private int numberOfCopies;

    public void bookCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getBookcopies() {
        return this.numberOfCopies;
    }

    public void readBook() {
        System.out.println("Reading Book");
    }
}

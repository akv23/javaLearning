package JavaLearning.oops;

public class Book {
    private int numberOfCopies;

    // Default constuctor
    public Book() {
        this(10);
    }

    // Parameter constuctor
    public Book(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public void setNoOfCopies(int numberOfCopies) {
        if (numberOfCopies > 0)
            this.numberOfCopies = numberOfCopies;
    }

    public void increaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.numberOfCopies + howMuch);
    }

    public void decreaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.numberOfCopies - howMuch);
    }

    public int getBookcopies() {
        return this.numberOfCopies;
    }

    public void readBook() {
        System.out.println("Reading Book");
    }
}

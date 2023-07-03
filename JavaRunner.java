import JavaLearning.Multiplication;
import JavaLearning.oops.Book;

public class JavaRunner {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        multiplication.MultiplicationTable(12, 11, 20);
        Book book = new Book();
        book.readBook();
        book.setNoOfCopies(10);
        book.increaseNoOfCopies(10);
        System.out.println(book.getBookcopies());
    }
}
import JavaLearning.oops.Book;
import JavaLearning.oops.Review;

public class BookRunner {
    public static void main(String[] args) {
        Book javaBook = new Book(10, "Java Learning", "ABC");
        System.out.println(javaBook);
        javaBook.addReview(new Review(10, "Good book for java learning", 5));
        javaBook.addReview(new Review(10, "Great book", 4));
        System.out.println(javaBook);
    }
}

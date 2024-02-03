package JavaLearning.oops;

import java.util.ArrayList;

public class Book {
    // private int numberOfCopies;
    // // Default constuctor
    // public Book() {
    //     this(10);
    // }
    // // Parameter constuctor
    // public Book(int numberOfCopies) {
    //     this.numberOfCopies = numberOfCopies;
    // }
    // public void setNoOfCopies(int numberOfCopies) {
    //     if (numberOfCopies > 0)
    //         this.numberOfCopies = numberOfCopies;
    // }
    // public void increaseNoOfCopies(int howMuch) {
    //     setNoOfCopies(this.numberOfCopies + howMuch);
    // }
    // public void decreaseNoOfCopies(int howMuch) {
    //     setNoOfCopies(this.numberOfCopies - howMuch);
    // }
    // public int getBookcopies() {
    //     return this.numberOfCopies;
    // }
    // public void readBook() {
    //     System.out.println("Reading Book");
    // }
    
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private ArrayList<Review> reviews = new ArrayList<Review>();

    public Book(int bookId,String bookName,String bookAuthor){
        this.bookAuthor=bookAuthor;
        this.bookId=bookId;
        this.bookName=bookName;
    }
    public void addReview(Review review){
        this.reviews.add(review);
    }

    public String toString(){
        return String.format("Book Id : %d,\nBook Name : %s,\nBook Author : %s,\nReviews : %s",bookId,bookName,bookAuthor,reviews);
    }
}

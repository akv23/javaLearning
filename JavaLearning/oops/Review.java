package JavaLearning.oops;

public class Review {
    private int reviewId;
    private String description;
    private int rating;

    public Review(int reviewId,String description,int rating){
        this.reviewId=reviewId;
        this.description=description;
        this.rating=rating;
    }
    
    public String toString(){
        return ("[Review Id : "+ reviewId+" Description : "+description+" Rating : "+rating+"]");
    }
}
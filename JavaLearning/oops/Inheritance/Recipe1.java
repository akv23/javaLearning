package JavaLearning.oops.Inheritance;

public class Recipe1 extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the Utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Cleanup the utensils");
    }
    
}

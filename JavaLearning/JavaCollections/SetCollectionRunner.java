package JavaLearning.JavaCollections;

import java.util.List;


public class SetCollectionRunner {
   public static void main(String[] args) {
    List<Character> characters = List.of('A','Z','C','A','Z','I','D');
    SetCollection setCollection = new SetCollection(characters);
    System.out.println(characters);
    // setCollection.sortSet();
    System.out.println(setCollection);

   }     
}
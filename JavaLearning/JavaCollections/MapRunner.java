package JavaLearning.JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. This has never happened before.";
        Map<Character,Integer> occurances = new HashMap<>();
        char[] characters = str.toCharArray();
        for(char character : characters){
            Integer integer = occurances.get(character);
            if(integer==null){
                occurances.put(character, 1);
            }else{
                occurances.put(character, integer+1);
            }
        }
        System.out.println(occurances);

        Map<String,Integer> stringOccurances = new HashMap<>();
        String[] strings = str.split(" ");
        // char[] characters = str.toCharArray();
        for(String string : strings){
            Integer integer = stringOccurances.get(string);
            if(integer==null){
                stringOccurances.put(string, 1);
            }else{
                stringOccurances.put(string, integer+1);
            }
        }
        System.out.println(stringOccurances);
    }
}

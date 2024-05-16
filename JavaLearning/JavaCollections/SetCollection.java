package JavaLearning.JavaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    private Set<Character> setCharacters;
    
    public SetCollection(List<Character> characters) {
        this.setCharacters = new HashSet<>(characters);
    }
    public void insertionOrder(){
        this.setCharacters = new LinkedHashSet<>(setCharacters);
    }
    public void sortSet(){
        this.setCharacters = new TreeSet<>(setCharacters);
    }

    @Override
    public String toString() {
        return setCharacters.toString();
    }

}

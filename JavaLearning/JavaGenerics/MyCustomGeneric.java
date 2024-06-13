package JavaLearning.JavaGenerics;

import java.util.ArrayList;

public class MyCustomGeneric<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }
    @Override
    public String toString() {
        return list.toString();
    }
}

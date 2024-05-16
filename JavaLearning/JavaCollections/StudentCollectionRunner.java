package JavaLearning.JavaCollections;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

class StudentComparator implements Comparator<StudentCollection>{

    @Override
    public int compare(StudentCollection studentCollection1, StudentCollection studentCollection2) {
        return Integer.compare(studentCollection1.getId(), studentCollection2.getId());
    }

 
    
}

public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<StudentCollection> students = List.of(new StudentCollection(10,"Utkarsh"),new StudentCollection(20,"Jishan"),new StudentCollection(3, "Nayan"));
        ArrayList<StudentCollection> studentAL = new ArrayList<>(students);
        // Collections.sort(studentAL,new StudentComparator());
        studentAL.sort(new StudentComparator());
        System.out.println(studentAL);

    }
    
}

package JavaLearning.oops;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> marks = new ArrayList<Integer>();

    public Student(String name, int... marks) {
        this.name = name;
        for (Integer mark : marks) {
            this.marks.add(mark);
        }
    }

    public Student() {
        this(null, null);
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (Integer integer : marks) {
            sum += integer;
        }
        return sum;
    }

    public int getMaximumMarks() {
        return Collections.max(marks);
    }

    public int getMinimumMarks() {
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
        return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(marks.size()), 3, RoundingMode.UP);
    }

    public void addNewMarks(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }

    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }

}

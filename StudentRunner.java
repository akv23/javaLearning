import java.math.BigDecimal;

import JavaLearning.oops.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Aman", 99, 98, 96, 92, 50);
        BigDecimal average = student.getAverageMarks();
        System.out.println("Total Marks : " + student.getTotalSumOfMarks());
        System.out.println("Maximum Marks : " + student.getMaximumMarks());
        System.out.println("Minimum Marks : " + student.getMinimumMarks());
        System.err.println("Average Marks : " + average);
        System.out.println(student.toString());
        student.addNewMarks(85);
        System.out.println(student.toString());
        student.removeMarkAtIndex(4);
        System.out.println(student.toString());

    }
}

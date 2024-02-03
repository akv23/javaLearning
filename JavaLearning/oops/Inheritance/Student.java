package JavaLearning.oops.Inheritance;

public class Student extends Person {
    private String collegeName;
    private int year;

    public Student(){
        this("collegeName", 0000);
        System.out.println("Student Constructor");
    }
    public Student(String collegeName, int year){
        this.collegeName=collegeName;
        this.year=year;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return super.toString() +"\n"+ String.format("College Name : %s,\nYear : %d",collegeName,year);
    }
}

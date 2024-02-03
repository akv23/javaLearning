package JavaLearning.oops.Inheritance;

import java.math.BigDecimal;

public class Employee extends Student{
    private String title;
    private String employer;
    private char employeeGrade;
    private BigDecimal salary;

    public Employee(){
        this("title", "employer", 'A', 0000);
        System.out.println("Employee Constructor");
    }
    public Employee(String title, String employer, char employeeGrade,double salary){
        this.title=title;
        this.employeeGrade=employeeGrade;
        this.employer=employer;
        this.salary= new BigDecimal(salary);
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setEmployer(String employer) {
        this.employer = employer;
    }
    public String getEmployer() {
        return employer;
    }
    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }
    public char getEmployeeGrade() {
        return employeeGrade;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public BigDecimal getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+String.format("Title : %s ,\nEmployer : %s ,\nEmployee Grade : %s,\nSalary : %f",title,employer,employeeGrade,salary);
    }
}

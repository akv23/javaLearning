package JavaLearning.JavaCollections;

public class StudentCollection implements Comparable<StudentCollection>{
    private int id;
    private String name;

    StudentCollection(int id, String name){
        super();
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }

    public void setSetId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        
        return  id + " "+ name ;
    }
    
    @Override
    public int compareTo(StudentCollection that) {
        
        return Integer.compare(this.id, that.id);
    }
}
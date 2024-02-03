package JavaLearning.oops;

public class Rectangle {
    private int length;
    private int width;
    public Rectangle(){
        this(5, 3);
    }
    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    public boolean isSquare(){
        if(this.length==this.width)
            return true;
        return false;
    }

    public int area(){
        return length*width;
    }
    
    public int perimeter(){
        return 2*(length+width);
    }

    public void setWidth(int width){
        this.width=width;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int length){
        this.length=length;
    }

    public int getLength(){
        return length;
    }


    @Override
    public String toString(){
        return String.format("Length = %d, Width = %d, Area = %d, Perimeter = %d, isSquare = %b",length,width,area(),perimeter(),isSquare());
    }
}

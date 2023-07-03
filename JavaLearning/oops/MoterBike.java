package JavaLearning.oops;

public class MoterBike {
    private int speed;

    // Default constuctor
    public MoterBike() {
        this(5);
    }

    // Parameter constuctor
    public MoterBike(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0)
            this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);

    }
}
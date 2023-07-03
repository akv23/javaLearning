import JavaLearning.oops.MoterBike;

public class MoterBikeRunner {
    public static void main(String[] args) {
        MoterBike ducati = new MoterBike(100);
        MoterBike honda = new MoterBike(50);
        ducati.start();
        honda.start();
        ducati.setSpeed(80);
        ducati.decreaseSpeed(100);
        honda.increaseSpeed(60);
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}

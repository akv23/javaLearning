import JavaLearning.oops.MoterBike;

public class MoterBikeRunner {
    public static void main(String[] args) {
        MoterBike ducati = new MoterBike();
        MoterBike honda = new MoterBike();
        ducati.start();
        honda.start();
        ducati.setSpeed(80);
        System.out.println(ducati.getSpeed());
    }
}

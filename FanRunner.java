import JavaLearning.oops.Fan;

public class FanRunner {

    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte)3);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
package JavaLearning;

public class Multiplication {
    public void MultiplicationTable() {
        MultiplicationTable(1);
    }

    public void MultiplicationTable(int tableOf) {
        MultiplicationTable(tableOf, 1, 10);
    }

    public void MultiplicationTable(int tableOf, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("\n%2d x %2d = %3d", tableOf, i, tableOf * i);
        }
    }
}

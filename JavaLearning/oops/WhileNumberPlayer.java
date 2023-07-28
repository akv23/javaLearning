package JavaLearning.oops;

public class WhileNumberPlayer {

    private int player;

    public WhileNumberPlayer() {
        this(0);
    }

    public WhileNumberPlayer(int player) {
        this.player = player;
    }

    public void printSquaresUptoLimit() {
        int square = 1;
        int i = 1;
        while (square <= player) {
            System.out.println(square);
            i++;
            square = i * i;

        }
    }

    public void printCubesUptoLimit() {
        int cube = 1;
        int i = 1;
        while (player >= cube) {
            System.out.println(cube);
            i++;
            cube = i * i * i;
        }

    }

}

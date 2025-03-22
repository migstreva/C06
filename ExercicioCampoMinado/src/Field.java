import java.util.Random;

public class Field {
    boolean[][] mines = new boolean[2][2];

    void createMine() {
        Random rand1 = new Random();
        Random rand2 = new Random();

        //Generates mine position into mines matrix
        int minePosX = rand1.nextInt(2);
        int minePosY = rand2.nextInt(2);

        //Sets mine into generated position
        mines[minePosX][minePosY] = true;
    }
}

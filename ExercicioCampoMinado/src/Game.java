import java.util.Scanner;

public class Game {
    Field field;
    int winsCount = 0;
    int lossesCount = 0;

    public Game() {
        field = new Field();
    }

    void gameRun(Scanner sc) {
        field.createMine();
        boolean gameOver = false;
        int turnsCount = 0;

        // Cheat
        /*
        for (int i = 0; i < field.mines.length; i++) {
            for (int j = 0; j < field.mines.length; j++) {
                System.out.print(field.mines[i][j] + " ");
            }
            System.out.println();
        }
        */


        while (!gameOver && turnsCount < 3) {
            System.out.println("Type row and column numbers (0 0 ; 0 1 ; 1 0 ; 1 1): ");
            int playerRow = sc.nextInt();
            int playerCol = sc.nextInt();
            System.out.println();

            if (field.mines[playerRow][playerCol]) {
                gameOver = true; //
                lossesCount++;
                System.out.println("Game Over!!! Better luck next time!");
            } else {
                System.out.println("Row " + playerRow + " and Column " + playerCol + " are clean!");
            }

            turnsCount++;
        }

        if (!gameOver) {
            winsCount++;
            System.out.println("You win!!!");
        }
    }

    int getWinsCount() {
        return winsCount;
    }

    int getLossesCount() {
        return lossesCount;
    }

}

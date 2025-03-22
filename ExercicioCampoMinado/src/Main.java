import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Welcome to JMines!-------------");
        System.out.println();
        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type nickname: ");
        player.nickname = sc.nextLine();
        System.out.println();

        boolean quit = false;
        while (!quit) {

            System.out.println("Playing as " + player.nickname);
            System.out.println("Wins: " + player.winsCount);
            System.out.println("Losses: " + player.lossesCount);
            System.out.println();

            System.out.println("Press 1 to start or 2 to quit...");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Game starting...");
                    System.out.println();
                    Game game = new Game();
                    game.gameRun(sc);
                    player.winsCount = game.getWinsCount();
                    player.lossesCount = game.getLossesCount();
                    break;

                case 2:
                    quit = true;
                    break;

                default:
                    break;
            }
            System.out.println();
        }

        sc.close();
    }
}
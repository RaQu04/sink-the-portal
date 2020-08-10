package game;

import java.util.Scanner;

import static game.Board.printBoard;
import static game.Player.playerMove;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Board board = new Board(8);
    static String[][] tab = board.createBoard();


    public static void setPortal(String[][] board) {
        int random = (int) (Math.random() * 2) + 1;

        int a = (int) (Math.random() * 4) + 1;
        int b = (int) (Math.random() * 4) + 1;

        board[a][b] = "[O]";
        if (random % 2 == 0) {
            board[a + 1][b] = "[O]";
            board[a + 2][b] = "[O]";
        } else {
            board[a][b + 1] = "[O]";
            board[a][b + 2] = "[O]";
        }
    }

    public static void checkPortalSunk(Portal portal) {
        //TODO
    }

    public static void startGame(Player player) {
        setPortal(tab);

        while (true) {

            System.out.println("Podaj współrzętne A i B: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            playerMove(tab, a, b);


            printBoard(tab);

        }

    }
}

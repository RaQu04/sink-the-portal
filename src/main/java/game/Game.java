package game;

import java.util.Scanner;

import static game.Board.printBoard;
import static game.Player.*;

public class Game {
    static int[][] answer = new int[9][9];
    static Scanner scanner = new Scanner(System.in);
    static Board board = new Board(8);
    static String[][] gameTab = board.createBoard();
    static int repeat = 0;

    static Portal onet = new Portal("onet.pl");


    public static void setPortal(String[][] board) {


        int random = (int) (Math.random() * 2) + 1;

        int a = (int) (Math.random() * 4) + 1;
        int b = (int) (Math.random() * 4) + 1;

        board[a][b] = "[O]";
        if (random % 2 == 0) {
            board[a + 1][b] = "[0]";
            board[a + 2][b] = "[O]";

            answer[a][b] = 1;
            answer[a + 1][b] = 1;
            answer[a + 2][b] = 1;


        } else {
            board[a][b + 1] = "[O]";
            board[a][b + 2] = "[O]";

            answer[a][b] = 1;
            answer[a][b + 1] = 1;
            answer[a][b + 2] = 1;

        }

    }

    public static boolean checkPortalSunk(int[][] tab, int a, int b) {
        //TODO

        if (tab[a - 1][b] == 1) {
            System.out.println("trafiłeś");
            return true;

        } else {
            System.out.println("pudło ");
        }return false;


    }

    public static void startGame(Player player) {
        int move = 0;
        setPortal(gameTab);


        while (repeat < 3) {


            System.out.println("Podaj współrzętne x i y: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            playerMove(gameTab, b, a);
            printBoard(gameTab);
            if(checkPortalSunk(answer, b, a)){
                repeat++;
            }
            move++;

        }

         System.out.println("Great! Your score is: " + move);


    }
}

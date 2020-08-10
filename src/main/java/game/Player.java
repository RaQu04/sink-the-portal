package game;

import lombok.Getter;

@Getter
public class Player {
    private String name;
    private static int repeat;

    public Player(String name) {
    }

    public static void playerMove(String[][] board, int a, int b) {
        if (!board[a - 1][b].equals("[X]")) {
            board[a - 1][b] = "[X]";
        }else {
            System.out.println("Błąd");
        }

        repeat++;

    }
}

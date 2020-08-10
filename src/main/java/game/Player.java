package game;

import lombok.Getter;

@Getter
public class Player {

    public Player(String name) {
    }

    public static void playerMove(String[][] board, int a, int b) {
        board[a - 1][b] = "[X]";
    }
}

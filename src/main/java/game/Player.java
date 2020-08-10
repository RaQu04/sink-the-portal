package game;

import lombok.Getter;

@Getter
public class Player {
    private String name;


    public Player(String name) {
    }

    public static void playerMove(String[][] board, int a, int b) {
        if (!board[a - 1][b].equals("[X]")) {
            board[a - 1][b] = "[X]";
        }else {
            System.out.println("Błąd, byłeś już na tym polu!");
        }

    }
}

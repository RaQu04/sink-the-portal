package game;

public class Board {

    private final int field;

    public Board(int field) {
        this.field = field;
    }

    public String[][] createBoard() {
        String[][] board = new String[field][field];

        for (int i = 0; i < board.length; i++) {
            for (int j = 1; j < board.length; j++) {
                board[i][j] = "[ ]";
            }
        }

        for (int i = 0; i < board.length - 1; i++) {
            board[i][0] = i + 1 + "";
        }
        for (int i = 1; i < board.length; i++) {
            board[board.length - 1][i] = " " + i + " ";
        }

        board[field - 1][0] = " ";
        return board;
    }

    public static void printBoard(String[][] board) {
        for (String[] ints : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.format("%2s ", ints[j]);
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void playerMove(String[][] board, int a, int b) {
        board[a - 1][b] = "[X]";
    }
}

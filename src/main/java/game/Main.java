package game;

import static game.Board.*;
import static game.Game.setPortal;
import static game.Game.startGame;
import static game.Player.playerMove;

public class Main {
    public static void main(String[] args) {

        Player lukas = new Player("Lukas");

        startGame(lukas);
    }
}

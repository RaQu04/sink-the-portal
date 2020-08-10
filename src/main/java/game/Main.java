package game;

import static game.Game.startGame;


public class Main {
    public static void main(String[] args) {

        Player lukas = new Player("Lukas");

        startGame(lukas);
    }
}

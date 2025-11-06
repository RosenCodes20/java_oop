import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer(6, "Rosen", "Nike");

        FootballPlayer footballPlayer1 = new FootballPlayer(30, "Ivcho", "Nike");

        FootballPlayer[] playersToMatch = {footballPlayer, footballPlayer1};

        ArrayList<FootballPlayer> matchedPlayers = FootballPlayer.returnMatchedFootballPlayers(playersToMatch, "Nike");

        for (FootballPlayer player : matchedPlayers) {
            System.out.println(player.getName());
        }
    }
}
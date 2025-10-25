import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer(42, "Nike", "Balkan");

        BasketballPlayer basketballPlayer1 = new BasketballPlayer(42, "Adidas", "Botev 2012");

        BasketballPlayer[] players = {basketballPlayer, basketballPlayer1};

        BasketballPlayer[] matchedPlayers = BasketballPlayer.returnBasketballPlayers(players, "Nike");

        for (BasketballPlayer player: matchedPlayers) {
            if (player != null) {
                System.out.println(player.getTeamName());
            }
        }
    }
}
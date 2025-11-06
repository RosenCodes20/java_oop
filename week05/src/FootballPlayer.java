import java.util.ArrayList;
import java.util.LinkedList;

public class FootballPlayer {
    private int shirtNumber;
    private String name;
    private String tShirtModel;

    public FootballPlayer(int shirtNumber, String name, String tShirtModel) {
        this.shirtNumber = shirtNumber;
        this.name = name;
        this.tShirtModel = tShirtModel;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public int getShirtNumber() {
        return this.shirtNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void settShirtModel(String shirtModel) {
        this.tShirtModel = shirtModel;
    }

    public String gettShirtModel() {
        return this.tShirtModel;
    }

    public static ArrayList<FootballPlayer> returnMatchedFootballPlayers(FootballPlayer[] footballPlayers, String tShirtModel) {
        ArrayList<FootballPlayer> matchedPlayers = new ArrayList<>();

        for (FootballPlayer player : footballPlayers) {
            if (player.tShirtModel.equals(tShirtModel)) {
                matchedPlayers.add(player);
            }
        }

        return matchedPlayers;
    }
}

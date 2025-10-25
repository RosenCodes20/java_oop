public class BasketballPlayer {
    private int shoeSize;
    private String shoeModel;
    private String teamName;

    public BasketballPlayer(int shoeSize, String shoeModel, String teamName) {
        this.shoeSize = shoeSize;
        this.shoeModel = shoeModel;
        this.teamName = teamName;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getShoeSize() {
        return this.shoeSize;
    }

    public void setShoeModel(String shoeModel) {
        this.shoeModel = shoeModel;
    }

    public String getShoeModel() {
        return this.shoeModel;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public static BasketballPlayer[] returnBasketballPlayers(BasketballPlayer[] players, String shoeModel) {
        BasketballPlayer[] matchedPlayers = new BasketballPlayer[players.length];
        int counter = 0;
        for (BasketballPlayer player: players) {
            if (player.shoeModel.equals(shoeModel)) {
                matchedPlayers[counter] = player;
            }

            counter++;
        }

        return matchedPlayers;
    }
}
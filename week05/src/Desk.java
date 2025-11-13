public class Desk {
    private String typeOfMade;
    private int boltsCount;

    public Desk(String typeOfMade, int boltsCount) {
        this.typeOfMade = typeOfMade;
        this.boltsCount = boltsCount;
    }

    public void setTypeOfMade(String typeOfMade) {
        this.typeOfMade = typeOfMade;
    }

    public String getTypeOfMade() {
        return this.typeOfMade;
    }

    public void setBoltsCount(int boltsCount) {
        this.boltsCount = boltsCount;
    }

    public int getBoltsCount() {
        return this.boltsCount;
    }

    public Desk[] returnMatchedDesks (Desk[] desks, int enteredBoltsCount) {
        Desk[] matchedDesks = new Desk[desks.length];
        int counter = 0;

        for (Desk desk : desks) {
            if (desk.boltsCount == boltsCount) {
                matchedDesks[counter] = desk;
            }
        }

        return matchedDesks;
    }
}

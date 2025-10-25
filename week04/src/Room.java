public class Room {
    private String tvType;
    private int objectsCount;

    public Room(String tvType, int objectsCount) {
        this.tvType = tvType;
        this.objectsCount = objectsCount;
    }

    public void setTvType(String enteredTvType) {
        this.tvType = enteredTvType;
    }

    public String getTvType() {
        return this.tvType;
    }

    public void setObjectsCount(int enteredObjectsCount) {
        if (enteredObjectsCount >= 2) {
            this.objectsCount = enteredObjectsCount;
        } else {
            System.out.println("Неправилно въведен брой на обекти!");
        }
    }

    public int getObjectsCount() {
        return this.objectsCount;
    }
}

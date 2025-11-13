import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Desk desk = new Desk("wood", 20);
        Desk desk1 = new Desk("metal", 19);

        Desk[] desks = {desk, desk1};
        Desk[] matchedDesks = Desk.returnMatchedDesks(desks, 20);

        for (Desk matchedDesk : matchedDesks) {
            if (matchedDesk != null) {
                System.out.println("Desk type of made: " + matchedDesk.getTypeOfMade() + ", Desk bolts count: " + matchedDesk.getBoltsCount());
            }
        }

        ArrayList<Desk> matchedDesksByTypeOfMade = Desk.returnMatchedDesksByTypeOfMade(desks, "metal");

        for (Desk matchedDeskByTypeOfMade: matchedDesksByTypeOfMade) {
            System.out.println("Desk type of made: " + matchedDeskByTypeOfMade.getTypeOfMade() + ", Desk bolts count: " + matchedDeskByTypeOfMade.getBoltsCount());
        }
    }
}
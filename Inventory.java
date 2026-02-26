import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Part> partsList = new ArrayList<>();
    private static int totalStockCount = 0;

    public void addPart(Part p) {
        partsList.add(p);
        totalStockCount++;
    }

    public void displayParts() {
        for (Part p : partsList) {
            System.out.println(p.getDetails());
        }
    }

    public static int getTotalStockCount() {
        return totalStockCount;
    }
}

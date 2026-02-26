import java.util.ArrayList;
import java.util.List;

public class Transaction implements Sellable {

    private String transactionID;
    private List<Part> purchasedParts = new ArrayList<>();
    private double totalAmount = 0;

    public Transaction(String transactionID) {
        this.transactionID = transactionID;
    }

    public void addPart(Part p) {
        purchasedParts.add(p);
        totalAmount += p.getPrice();
    }

    @Override
    public double calculateTax() {
        return totalAmount * 0.10;
    }

    @Override
    public void generateReceipt() {
        System.out.println("Transaction ID: " + transactionID);
        for (Part p : purchasedParts) {
            System.out.println(p.getDetails());
        }
        System.out.println("Total: Ksh" + totalAmount);
        System.out.println("Tax: Ksh" + calculateTax());
        System.out.println("Grand Total: Ksh" + (totalAmount + calculateTax()));
    }
}

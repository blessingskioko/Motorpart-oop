public class EnginePart extends Part implements Maintainable {

    private int warrantyPeriod;

    public EnginePart(String partID, String name, double price, int warrantyPeriod) {
        super(partID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public String getDetails() {
        return "ID: " + getPartID() +
                ", Name: " + getName() +
                ", Price: $" + getPrice() +
                ", Warranty: " + warrantyPeriod + " months";
    }

    @Override
    public void scheduleMaintenance() {
        System.out.println("Maintenance scheduled for " + getName());
    }
}
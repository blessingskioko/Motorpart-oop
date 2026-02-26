public class Main {
    public static void main(String[] args) {

        EnginePart part1 = new EnginePart("E101", "Oil Filter", 5000.0, 12);
        EnginePart part2 = new EnginePart("E102", "Spark Plug", 3000.0, 6);

        Inventory inventory = new Inventory();
        inventory.addPart(part1);
        inventory.addPart(part2);

        System.out.println("Available Parts:");
        inventory.displayParts();

        Customer customer = new Customer("C001", "Maya Cruz");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Role: " + customer.getRole());

        Transaction transaction = new Transaction("T001");
        transaction.addPart(part1);
        transaction.addPart(part2);

        transaction.generateReceipt();

        part1.scheduleMaintenance();
    }
}
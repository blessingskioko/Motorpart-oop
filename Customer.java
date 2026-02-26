public class Customer extends User {

    public Customer(String userID, String name) {
        super(userID, name);
    }

    @Override
    public String getRole() {
        return "Customer";
    }
}

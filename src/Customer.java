public class Customer extends User {

    private boolean verified;

    public Customer(String address, String fullName, String password, String phone, String username, String zipcode) {
        super(address, fullName, password, phone, USER_ROLE.CUSTOMER, username, zipcode);
        this.verified = false; // Newly registered customers are not verified by default
    }

    // Method to add a new customer
    public void addCustomer() {
        // Logic to add a new customer goes here
        System.out.println("Customer added successfully.");
    }

    // Method to request confirmation (e.g., via email)
    public void confirmationRequest() {
        // Logic to send a confirmation request goes here
        System.out.println("Confirmation request sent.");
    }

    // Method to create and assign a shopping cart to the customer
    public void createAssignCart() {
        // Logic to create and assign a shopping cart goes here
        System.out.println("Shopping cart created and assigned.");
    }

    // Method to delete a customer
    public void deleteCustomer() {
        // Logic to delete a customer goes here
        System.out.println("Customer deleted successfully.");
    }

    // Method to edit customer information
    public void editCustomer() {
        // Logic to edit customer information goes here
        System.out.println("Customer information edited successfully.");
    }

    // Method to promote a customer (e.g., to a premium status)
    public void promoteCustomer() {
        // Logic to promote a customer goes here
        System.out.println("Customer promoted successfully.");
    }

    // Method for customer registration
    public void registration() {
        // Logic for customer registration goes here
        System.out.println("Customer registered successfully.");
    }

    // Method to send a verification email to the customer
    public void sendVerificationEmail() {
        // Logic to send a verification email goes here
        System.out.println("Verification email sent.");
    }

    // Getter and Setter for the 'verified' attribute
    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}

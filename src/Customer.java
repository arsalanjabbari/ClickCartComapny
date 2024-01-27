import java.util.Scanner;

public class Customer extends User {


    public Customer(String username, String password, String email, String phone, String address, String zipcode, String fullname) {
        super(username, password, email, phone, address, zipcode, fullname, USER_ROLE.CUSTOMER);
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
    public static void promoteCustomer() {
        // Logic to promote a customer goes here
        System.out.println("Customer promoted successfully.");
    }


    public static void registerCustomer(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();

        // Alternative Flow b.1
        while (isUsernameReserved(username)) {
            System.out.println("Username is reserved. Please choose another one.");
            System.out.print("Enter your username: ");
            username = scanner.next();
        }

        System.out.print("Enter your password: ");
        String password = scanner.next();

        System.out.print("Enter your fullname: ");
        String fullname = scanner.next();

        System.out.print("Enter your e-mail: ");
        String email = scanner.next();

        // Alternative Flow b.2
        while (isEmailReserved(email)) {
            System.out.println("Email is reserved. Please choose another one.");
            System.out.print("Enter your e-mail: ");
            email = scanner.next();
        }

        System.out.print("Enter your phone: ");
        String phone = scanner.next();

        System.out.print("Enter your address: ");
        String address = scanner.next();

        System.out.print("Enter your zip-code: ");
        String zipCode = scanner.next();

        // Alternative Flow b.3
        if (username.isEmpty() || password.isEmpty() || fullname.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || zipCode.isEmpty()) {
            System.out.println("Please fill all fields. Registration failed.");
            registerCustomer(scanner);
            return;
        }

        // Register the customer
        Customer newCustomer = new Customer(username, password, email, phone, address, zipCode, fullname);
        customerDatabase.add(newCustomer);

        // Send verification email
        boolean verificationSuccess = sendVerificationEmail(newCustomer);

        if (verificationSuccess) {
            System.out.println("Verification email delivered. Your registration has completed!");
            System.out.println("Redirecting to the customer's first page...");
        } else {
            System.out.println("Email verification failed. Please try again.");
        }
    }

    private static boolean isUsernameReserved(String username) {
        for (Customer customer : customerDatabase) {
            if (customer.getUsername().equalsIgnoreCase(username))
                return true; // Username is reserved
        }
        return false; // Username is not reserved
    }

    private static boolean isEmailReserved(String email) {
        for (Customer customer : customerDatabase) {
            if (customer.getEmail().equalsIgnoreCase(email))
                return true; // Username is reserved
        }
        return false; // Username is not reserved
    }

    private static boolean sendVerificationEmail(Customer customer) {
        // In a real-world scenario, you would integrate with an email service
        // This is a placeholder, simulate sending an email and wait for confirmation
        System.out.println("Simulating sending a verification email to " + customer.getEmail());
        System.out.println("Please confirm the email within the next 2 minutes.");

        // Simulate waiting for confirmation (2 minutes timeout)
        try {
            Thread.sleep(2 * 15 * 1000); // Sleep for 2 minutes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Simulate receiving confirmation
        boolean confirmationReceived = true;

        return confirmationReceived;
    }
}

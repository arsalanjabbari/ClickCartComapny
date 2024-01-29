import java.util.Scanner;

public class Customer extends User {

    protected Cart cart;
    public static Scanner scanner = new Scanner(System.in);




    public Customer(String username, String password, String email, String phone, String address, String zipcode, String fullname) {
        super(username, password, email, phone, address, zipcode, fullname, USER_ROLE.CUSTOMER);
        this.cart = new Cart();
    }

    // Method to add a new customer
    public static void addCustomer(String username, String password, String email, String phone, String address, String zipcode, String fullname) {
        Customer newCustomer = new Customer(username, password, email, phone, address, zipcode, fullname);
        customerDatabase.add(newCustomer);
        System.out.println("Customer added: " + newCustomer);
    }


    // Method to delete a customer
    public static void deleteCustomer(Customer customer) {
        customerDatabase.remove(customer);
        System.out.println("Customer deleted: " + customer);
    }

    // Method to edit customer information
    public static void editCustomer(Customer customer, String password, String email, String phone, String address, String zipcode, String fullname) {
        customer.setPassword(password);
        customer.setEmail(email);
        customer.setPhone(phone);
        customer.setAddress(address);
        customer.setZipcode(zipcode);
        customer.setFullName(fullname);
        System.out.println("Customer edited: " + customer);
    }

    // Method to promote a customer (e.g., to a premium status)
    public static void promoteCustomer() {

        // Display the list of customers
        System.out.println("List of Customers:");
        for (Customer customer : User.customerDatabase) {
            System.out.println(customer.getUsername());
        }

        // Prompt admin to enter the username of the customer to be promoted
        System.out.print("Enter the username of the customer to promote: ");

        String customerUsername = scanner.nextLine();

        // Find the customer in the database
        Customer customerToPromote = findCustomerByUsername(customerUsername);

        if (customerToPromote != null) {
            // Promote the customer
            customerToPromote.setRole(USER_ROLE.ADMIN);
            Admin adminToPromote = new Admin(customerToPromote.getUsername(), customerToPromote.getPassword());
            customerDatabase.remove(customerToPromote);
            deleteCustomer(customerToPromote);
            adminDatabase.add(adminToPromote);
            System.out.println("Customer " + customerUsername + " promoted to Admin successfully.");
        } else {
            System.out.println("Customer not found. Promotion failed.");
        }
    }

    private static Customer findCustomerByUsername(String username) {
        for (Customer customer : User.customerDatabase) {
            if (customer.getUsername().equals(username)) {
                return customer;
            }
        }
        return null; // Customer not found
    }


    public static Customer registerCustomer(Scanner scanner) {
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
            return null;
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
        return newCustomer;
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
            Thread.sleep(2 * 5 * 1000); // Sleep for 2 minutes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Simulate receiving confirmation
        boolean confirmationReceived = true;

        if (confirmationReceived) {
            return true;
        }
        System.out.println("Your account did not verify! You met email verification deadline.");
        return false;
    }

    // Setter for cart
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    // Getter for cart
    public Cart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", zipcode='" + getZipcode() + '\'' +
                ", fullname='" + getFullName() + '\'' +
                ", role=" + getRole() +
                ", cart=" + getCart() +
                '}';
    }
}

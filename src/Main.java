import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        User.initSuperAdmin();

        loginWelcome();

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {

            System.out.println("Enter your username: ");
            String username = scanner.nextLine();

            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            roleWelcome();
            int roleChoice = scanner.nextInt();
            USER_ROLE role = getRoleFromChoice(roleChoice);

            // Perform authentication
            User user = null;
            if (User.authenticateUser(username, password, role)) {
                System.out.println("Authentication successful!");
                // Redirect the user based on their role
                if (role.equals(USER_ROLE.CUSTOMER)) {
                    for (Customer customer : User.customerDatabase) {
                        if (customer.getUsername().equals(username)) {
                            user = customer;
                        }
                    }
                }
                else if (role.equals(USER_ROLE.ADMIN)) {
                    for (Admin admin : User.adminDatabase) {
                        if (admin.getUsername().equals(username)) {
                            user = admin;
                        }
                    }
                }
                else {
                    for (SuperAdmin sadmin : User.superAdminDatabase) {
                        if (sadmin.getUsername().equals(username)) {
                            user = sadmin;
                        }
                    }
                }
                redirectToHomePage(user, role);
            } else {
                System.out.println("Authentication failed. Please enter your information again or go to the registration page.");
                // Alternative Flow: Ask the user to enter information again or go to the registration page
                // Add your logic for handling this alternative flow
            }
        }
        else if (choice == 2) {
            User customer = Customer.registerCustomer(scanner);
            redirectToHomePage(customer, USER_ROLE.CUSTOMER);
        } else {
            System.out.println("Invalid choice. Exiting...");
        }
    }


    private static USER_ROLE getRoleFromChoice(int roleChoice) {
        switch (roleChoice) {
            case 1:
                return USER_ROLE.CUSTOMER;
            case 2:
                return USER_ROLE.ADMIN;
            default:
                return USER_ROLE.SUPER_ADMIN;
        }
    }

    private static void redirectToHomePage(User user, USER_ROLE role) {

        System.out.println("Redirecting to " + role + " home page...");
        if (role.equals(USER_ROLE.CUSTOMER)) {

            boolean loggedIn = true;

            while (loggedIn) {
                System.out.println("Customer Page:");
                System.out.println("1. Search Product");
                System.out.println("2. Browse Categories");
                System.out.println("3. Check Cart");
                System.out.println("4. Logout");
                System.out.println("Enter your choice (1-4): ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        OnlineShopSystem.searchProduct((Customer) user);
                        break;
                    case 2:
                        OnlineShopSystem.browseCategory(user);
                        break;
                    case 3:
                        Cart.checkCart((Customer) user);
                        break;
                    case 4:
                        System.out.println("Logged out. Goodbye!");
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            }
        }
        else if (role.equals(USER_ROLE.ADMIN)) {

            boolean loggedIn = true;

            while (loggedIn) {
                System.out.println("Admin Page:");
                System.out.println("1. Manage Products");
                System.out.println("2. Manage Customers");
                System.out.println("3. Manage Categories");
                System.out.println("4. Delete a Comment");
                System.out.println("5. Logout");
                System.out.print("Enter your choice (1-4): ");


                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        OnlineShopSystem.manageProduct();
                        break;
                    case 2:
                        OnlineShopSystem.manageCustomer();
                        break;
                    case 3:
                        OnlineShopSystem.manageCategory();
                        break;
                    case 4:
                        System.out.println("Enter a product name: ");
                        String relatedProductName = scanner.nextLine();
                        ProductDescription relatedProduct = null;
                        for (ProductDescription product : ProductDescription.productDatabase) {
                            if (product.getName().equals(relatedProductName)) {
                                relatedProduct = product;
                                break;
                            }

                        }
                        System.out.println("Enter a comment id: ");
                        int relatedCmId = scanner.nextInt();
                        Comment relatedCm = null;
                        assert relatedProduct != null;
                        for (Comment comment : relatedProduct.getComments()) {
                            if (comment.getId() == relatedCmId) {
                                relatedCm = comment;
                            }
                        }
                        Comment.deleteComment(relatedProduct, relatedCm);
                        break;
                    case 5:
                        System.out.println("Logged out. Goodbye!");
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            }
        }
        else if (role.equals(USER_ROLE.SUPER_ADMIN)) {

            boolean loggedIn = true;

            while (loggedIn) {
                System.out.println("SuperAdmin Page:");
                System.out.println("1. Manage Products");
                System.out.println("2. Manage Customers");
                System.out.println("3. Manage Categories");
                System.out.println("4. Promote Customer");
                System.out.println("5. Demote Admin");
                System.out.println("6. Logout");
                System.out.print("Enter your choice (1-6): ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        OnlineShopSystem.manageProduct();
                        break;
                    case 2:
                        OnlineShopSystem.manageCustomer();
                        break;
                    case 3:
                        OnlineShopSystem.manageCategory();
                        break;
                    case 4:
                        Customer.promoteCustomer();
                        break;
                    case 5:
                        Admin.demoteAdmin();
                        break;
                    case 6:
                        System.out.println("Logged out. Goodbye!");
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            }
        }

    }

    private static void loginWelcome() {
        System.out.println("Welcome to ClickCartCompany!");
        System.out.println("1. Log-In");
        System.out.println("2. Register");
        System.out.print("Enter your choice (1 or 2): ");
    }

    private static void roleWelcome() {
        System.out.println("Select your role:");
        System.out.println("1. Customer");
        System.out.println("2. Admin");
        System.out.println("3. Super-Admin");
        System.out.print("Enter your role (1, 2, or 3): ");

    }

}

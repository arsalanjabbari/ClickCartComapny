import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User.setSuperAdmin();

        loginWelcome();

        int choice = scanner.nextInt();

        if (choice == 1) {

            System.out.print("Enter your username: ");
            String username = scanner.next();

            System.out.print("Enter your password: ");
            String password = scanner.next();

            roleWelcome();

            int roleChoice = scanner.nextInt();
            String role = getRoleFromChoice(roleChoice);

            // Perform authentication
            if (User.authenticateUser(username, password, role)) {
                System.out.println("Authentication successful!");
                // Redirect the user based on their role
                redirectToHomePage(role);
            } else {
                System.out.println("Authentication failed. Please enter your information again or go to the registration page.");
                // Alternative Flow: Ask the user to enter information again or go to the registration page
                // Add your logic for handling this alternative flow
            }
        }
        else if (choice == 2) {
            Customer.registerCustomer(scanner);
            redirectToHomePage("CUSTOMER");
        } else {
            System.out.println("Invalid choice. Exiting...");
        }

        scanner.close();
    }


    private static String getRoleFromChoice(int roleChoice) {
        switch (roleChoice) {
            case 1:
                return "Customer";
            case 2:
                return "Admin";
            case 3:
                return "Super-Admin";
            default:
                return "";
        }
    }

    private static void redirectToHomePage(String role) {

        System.out.println("Redirecting to " + role + " home page...");

        if (role.equals(USER_ROLE.CUSTOMER.toString())) {
            Scanner scanner = new Scanner(System.in);

            boolean loggedIn = true;

            while (loggedIn) {
                System.out.println("Customer Page:");
                System.out.println("1. Search Product");
                System.out.println("2. Browse Categories");
                System.out.println("3. Check Cart");
                System.out.println("4. Logout");
                System.out.print("Enter your choice (1-4): ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        OnlineShopSystem.searchProduct();
                        break;
                    case 2:
                        OnlineShopSystem.browseCategory();
                        break;
                    case 3:
                        Cart.checkCart();
                        break;
                    case 4:
                        System.out.println("Logging out. Goodbye!");
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            }
            scanner.close();
        }
        else if (role.equals(USER_ROLE.ADMIN.toString())) {
            Scanner scanner = new Scanner(System.in);

            boolean loggedIn = true;

            while (loggedIn) {
                System.out.println("Admin Page:");
                System.out.println("1. Manage Products");
                System.out.println("2. Manage Customers");
                System.out.println("3. Manage Categories");
                System.out.println("4. Logout");
                System.out.print("Enter your choice (1-4): ");

                int choice = scanner.nextInt();

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
                        System.out.println("Logging out. Goodbye!");
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            }

            scanner.close();
        }
        else if (role.equals(USER_ROLE.SUPER_ADMIN.toString())) {
            Scanner scanner = new Scanner(System.in);

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
                        System.out.println("Logging out. Goodbye!");
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            }

            scanner.close();
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

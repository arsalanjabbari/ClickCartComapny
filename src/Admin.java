import java.util.Scanner;

public class Admin extends User {

    static Scanner scanner = new Scanner(System.in);

    public Admin(String username, String password) {
        super(username, password, USER_ROLE.ADMIN);
    }

    // Method to demote an admin
    public static void demoteAdmin() {
        System.out.println("List of Admins:");
        for (Admin admin : User.adminDatabase) {
            System.out.println(admin.getUsername());
        }

        // Prompt admin to enter the username of the admin to be demoted
        System.out.print("Enter the username of the admin to demote: ");

        String adminUsername = scanner.nextLine();

        // Find the admin in the database
        Admin adminToDemote = findAdminByUsername(adminUsername);

        if (adminToDemote != null) {
            // Promote the customer
            adminToDemote.setRole(USER_ROLE.CUSTOMER);
            Customer customer = new Customer(adminToDemote.getUsername(), adminToDemote.getPassword(), " ", " ", " ", " "," ");
            adminDatabase.remove(adminToDemote);
            customerDatabase.add(customer);
            System.out.println("Admin " + adminUsername + " demoted to Customer successfully.");
        } else {
            System.out.println("Admin not found. Demotion failed.");
        }
    }
    private static Admin findAdminByUsername(String username) {
        for (Admin admin : User.adminDatabase) {
            if (admin.getUsername().equals(username)) {
                return admin;
            }
        }
        return null; // Customer not found
    }
}
public class Admin extends User {

    public Admin(String username, String password, String email, String phone, String address, String zipcode, String fullname) {
        super(username, password, email, phone, address, zipcode, fullname, USER_ROLE.ADMIN);
    }

    // Method to demote an admin
    public static void demoteAdmin() {
        // Logic to demote an admin goes here
        System.out.println("Admin demoted successfully.");
    }
}

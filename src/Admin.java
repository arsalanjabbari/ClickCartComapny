public class Admin extends User {

    public Admin(String address, String fullName, String password, String phone, String username, String zipcode) {
        super(address, fullName, password, phone, USER_ROLE.ADMIN, username, zipcode);
    }

    // Method to demote an admin
    public void demoteAdmin() {
        // Logic to demote an admin goes here
        System.out.println("Admin demoted successfully.");
    }
}

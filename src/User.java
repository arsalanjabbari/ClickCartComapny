import java.util.ArrayList;
import java.util.List;

public class User {
    private String address;
    private String fullName;
    private String password;
    private String phone;
    private String email;
    private USER_ROLE role;
    private String username;
    private String zipcode;
    protected static List<Customer> customerDatabase = new ArrayList<>();
    protected static List<Admin> adminDatabase = new ArrayList<>();
    protected static List<SuperAdmin> superAdminDatabase = new ArrayList<>();

    public User(String username, String password, String email, String phone, String address, String zipcode, String fullName, USER_ROLE role) {
        this.address = address;
        this.fullName = fullName;
        this.password = password;
        this.phone = phone;
        this.role = role;
        this.username = username;
        this.email = email;
        this.zipcode = zipcode;
    }

    public User(String username, String password, USER_ROLE superAdmin) {
        this.username = username;
        this.password = password;
        this.role = superAdmin;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for fullName
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter and Setter for role
    public USER_ROLE getRole() {
        return role;
    }

    public void setRole(USER_ROLE role) {
        this.role = role;
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for zipcode
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    // Method
    public static boolean authenticateUser(String username, String password, String role) {
        switch (role) {
            case "Customer":
                return authenticateCustomer(username, password);
            case "Admin":
                return authenticateAdmin(username, password);
            case "Super-Admin":
                return authenticateSuperAdmin(username, password);
            default:
                return false;
        }
    }

    private static boolean authenticateCustomer(String username, String password) {
        for (Customer customer : customerDatabase) {
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                return true; // Authentication successful for customer
            }
        }
        return false; // Authentication failed
    }

    private static boolean authenticateAdmin(String username, String password) {
        for (Admin admin : adminDatabase) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                return true; // Authentication successful for admin
            }
        }
        return false; // Authentication failed
    }

    private static boolean authenticateSuperAdmin(String username, String password) {
        for (SuperAdmin superAdmin : superAdminDatabase) {
            if (superAdmin.getUsername().equals(username) && superAdmin.getPassword().equals(password)) {
                return true; // Authentication successful for super-admin
            }
        }
        return false; // Authentication failed
    }

    public String getEmail() {
        return email;
    }

    public static void setSuperAdmin() {
        SuperAdmin superAdmin = new SuperAdmin("arsalan", "191919");
        superAdminDatabase.add(superAdmin);
    }
}
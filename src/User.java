public class User {
    private String address;
    private String fullName;
    private String password;
    private String phone;
    private USER_ROLE role;
    private String username;
    private String zipcode;

    public User(String address, String fullName, String password, String phone, USER_ROLE role, String username, String zipcode) {
        this.address = address;
        this.fullName = fullName;
        this.password = password;
        this.phone = phone;
        this.role = role;
        this.username = username;
        this.zipcode = zipcode;
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
    public void login() {
        System.out.println("User login logic goes here.");
        // You can add your authentication logic here.
    }
}

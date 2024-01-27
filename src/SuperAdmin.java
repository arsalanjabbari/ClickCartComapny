public class SuperAdmin extends User {

    private final String username;
    private final String password;

    SuperAdmin(String username, String password) {
        super(username, password, USER_ROLE.SUPER_ADMIN);
        this.username = "arsalan";
        this.password = "191919";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
public class SuperAdmin extends User {

    public SuperAdmin(String address, String fullName, String password, String phone, String username, String zipcode) {
        super(address, fullName, password, phone, USER_ROLE.SUPER_ADMIN, username, zipcode);
    }
}

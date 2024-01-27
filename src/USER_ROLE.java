public enum USER_ROLE {
    ADMIN("Admin"),
    CUSTOMER("Customer"),
    SUPER_ADMIN("SuperAdmin");

    private final String roleName;

    USER_ROLE(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}

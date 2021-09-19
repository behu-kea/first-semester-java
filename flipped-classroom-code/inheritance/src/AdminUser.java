public class AdminUser extends User {
    public String email;

    public AdminUser(String username, Password password, String email) {
        super(username, password);
        this.email = email;
    }

    public String showStatistics() {
        return this.email + this.username;
    }
}

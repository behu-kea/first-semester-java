public class User {
    private String username;
    private String password;
    private String cpr;

    public User(String username, String password, String cpr) {
        this.username = username;
        this.password = password;
        this.cpr = cpr;
    }

    public String generateNewPassword() {
        return "asd123";
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
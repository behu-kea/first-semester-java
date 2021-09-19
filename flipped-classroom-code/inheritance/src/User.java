public class User {
    public String username;
    public Password password;

    public User(String username, Password password) {
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword() {
        System.out.println("in User password generator");
        return "asd";
    }
}

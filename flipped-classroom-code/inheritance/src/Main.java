public class Main {
    public static void main(String[] args) {
        Password jensPassword =  new Password("hejhej", "esha256");

        User jens = new User("jens123", jensPassword);
        PremiumUser rigmandJens = new PremiumUser("rigmandDollars",jensPassword);
        //System.out.println(rigmandJens.username);
        System.out.println(rigmandJens.generateNewPassword());

        AdminUser perFraIt = new AdminUser("perFraIt", jensPassword, "b@b.dk");
        //ystem.out.println(perFraIt.email);

        //System.out.println(perFraIt.showStatistics());


    }
}

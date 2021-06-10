public class Main {
    public static void main(String[] args) {
        boolean isSunShining = false;

        if (isSunShining == true) {
            //System.out.println("The sun is shining ☀️");
            //System.out.println(2323);
            String hej = "asd";
        } else {
            //System.out.println("the sun is not shining ☁️😥");
        }

        //System.out.println("Do i reach this code?");

        int televisionPrice = 30000;
        int accountBalance = 27000;

        int difference = accountBalance - televisionPrice;
        System.out.println(difference);

        test();

        if (difference > 2000) {
            System.out.println("Congrats you can buy the television 📺");
        } else if (difference >= 0 && difference <= 2000) {
            System.out.println("You can buy but dont have a lot left 💸");
        } else {
            System.out.println("I'm so sorry you cannot buy the television 😥");
        }

        System.out.println("done");
    }

    public static void test() {
        System.out.println("asd");
    }
}

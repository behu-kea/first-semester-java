import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int televisionPrice = 30000;
        int accountBalance = 27000;

        int difference = accountBalance - televisionPrice;

        if (difference > 2000) {
            System.out.println("Congrats you can buy the television 📺");
        } else if (difference >= 0 && difference <= 2000) {
            System.out.println("You can buy but dont have a lot left 💸");
        } else {
            System.out.println("I'm so sorry you cannot buy the television 😥");
        }

        System.out.println("done");

        int[] productPrices = {1, 3, 90};
        int sum = getSumFromArray(productPrices);
        System.out.println("The sum of the array is: " + sum);
    }

    public static int getSumFromArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + i;
        }

        return sum;
    }
}

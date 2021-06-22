import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mood = "happy";

        if (mood == "happy") {
            System.out.println("You seem happy today! 😄");
        } else if (mood == "sad") {
            System.out.println("You seem sad today 🙁");
        } else {
            System.out.println("I don't know what mood you are in");
        }

        System.out.println("done");

        int[] productPrices = {1, 3, 90};
        int sum = getSumFromArray(productPrices);
        System.out.println("The sum of the array is: " + sum);
    }

    public static int getSumFromArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int currentPrice = array[i];
            sum = sum + currentPrice;
        }

        return sum;
    }
}

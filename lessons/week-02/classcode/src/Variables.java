import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
/*
        System.out.println("exercise for tuesday");
        System.out.println("Enter numerical value");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt(); // Read numerical value from scanner
        scanner.nextLine();
        System.out.println("Enter 1st string");
        String string1 = scanner.nextLine(); // Read 1st string (this is skipped)
        System.out.println("Enter 2nd string");
        String string2 = scanner.nextLine();
        double double1 = scanner.nextDouble();
        System.out.println(double1);
        */


        int num = 123;
        String numString = num + "";

        int firstDigit = Integer.parseInt(String.valueOf(numString.charAt(0)));
        int secondDigit = numString.charAt(1);
        int thirdDigit = numString.charAt(2);
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println(firstDigit);
        System.out.println(sum);
        System.out.println("The sum of " +firstDigit+ " and 4 and 4 is " + (firstDigit + secondDigit + thirdDigit));
        System.out.println(-7%6);


    }
}

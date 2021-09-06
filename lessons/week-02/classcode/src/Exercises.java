import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        double taxes = 50000.0;
        double salary = 50000.0;

        if (salary > 15000.0) {
            taxes = salary * 0.50;
        }
        if (salary > 30000.0) {
            taxes = salary * 2;
        }
        salary -= 25000.00;
        System.out.println(taxes + ":" + salary);

        Scanner scanner = new Scanner(System.in);

        int number = 1;
        while (number >= 0) {
            number = scanner.nextInt();
        }
    }
}



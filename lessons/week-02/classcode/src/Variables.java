import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        int test = 2;



        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();  // Read user input
        System.out.println("Name is: " + name);  // Output user input
        System.out.println("asdasdasdas");

        String age = scanner.nextLine();  // Read user input
        System.out.println("Name is: " + age);  // Output user input


        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        System.out.println(num1+num2+num3+num4+num5);
    }
}

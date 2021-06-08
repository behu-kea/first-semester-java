public class Main {
    public static void main(String[] args) {

        String name = "";
        for (int i = 0; i < 3; i++) {
            name = "Camilla";
        }

        System.out.println(name);

        int sum = 0;
        for (int i = 0; i < 1000001; i++) {
            sum = i + sum;
        }

        System.out.println(sum);
    }
}

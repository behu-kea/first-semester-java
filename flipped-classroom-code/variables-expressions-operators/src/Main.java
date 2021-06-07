public class Main {
    public static void main(String[] args) {
        // Variable declaration
        int age;
        // Variable declaration
        int height;
        // Variable assignment
        age = 33;
        // Variable assignment
        height = 2;

        double heightBetter = 1.78;

        char firstLetterOfName = 'b';
        String name = "Benjamin";

        System.out.println(name);

        int sum = 1 + 2;
        System.out.println(sum);

        int product = 3 * 5;

        // 23.5 / 56.9
        double product2 = 23.5 / 56.9;
        System.out.println(product2);

        // Noget kode der kan finde ud af
        // Fod til meter generator

        // antal fod per meter 0,3138535
        double feetPerMeter = 0.3138535;
        // Put in your boat size in feet
        double boatSizeInFeet = 23;
        double boatSizeInMeters = boatSizeInFeet * feetPerMeter;
        System.out.println("Your boat is " + boatSizeInMeters + " meters");
    }
}

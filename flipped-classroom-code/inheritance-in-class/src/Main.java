public class Main {

    public static void main(String[] args) {
        Garment garment1 = new Garment("garment", 100);

        Trouser blueJeans = new Trouser("blue jeans", 100, 100);
        System.out.println(blueJeans);

        Hat funnyHat = new Hat("Funny hat", 100, 100);
        System.out.println(blueJeans);
        Garment[] garments = {garment1, blueJeans, funnyHat};
        for (Garment garment: garments) {
            garment.printGarment();
        }
    }
}

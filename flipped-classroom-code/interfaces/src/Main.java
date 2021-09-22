public class Main {
    public static void main(String[] args) {
        GameObject player1 = new Player();
        player1.move();

        GameObject car1 = new Car();
        car1.move();

        Elephant bennyTheElephant = new Elephant();
        bennyTheElephant.animalSound();
        bennyTheElephant.sleep();



    }

}

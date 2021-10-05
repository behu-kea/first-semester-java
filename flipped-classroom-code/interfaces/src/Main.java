import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GameObject player1 = new Player();
        player1.move();
        player1.draw(new Canvas());

        GameObject car1 = new Car();
        car1.move();

        car1.draw(new Canvas());

        Elephant bennyTheElephant = new Elephant();
        bennyTheElephant.animalSound();
        bennyTheElephant.sleep();



    }

}

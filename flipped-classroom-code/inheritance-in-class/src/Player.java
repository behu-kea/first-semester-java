import java.util.ArrayList;
import java.util.HashMap;

public class Player extends PlayerStats implements GameObject, SecondInterface {
    public String description;

    public Player(String description) {
        this.description = description;
    }

    @Override
    public void move() {
        int h = 0;

        HashMap<String, Integer> usernameAges = new HashMap<String, Integer>();
        usernameAges.put("peteTheBeat", 23);
        usernameAges.put("mariannner", 29);

        // setting a value at a specific key
        usernameAges.put("typppi", 31);
        System.out.println(usernameAges);
        usernameAges.put("peteTheBeat", 99);
        System.out.println(usernameAges);

        // getting a value at a specific key
        System.out.println(usernameAges.get("mariannner"));



    }

    public void die() {

    }

    public void interact() {

    }

    public void sayHi() {
        System.out.println("hiu");
    }

    public void printStats() {

    }
}

public class Player extends PlayerStats implements GameObject, SecondInterface {
    public String description;

    public Player(String description) {
        this.description = description;
    }

    @Override
    public void move() {
        String hej = "asd";
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

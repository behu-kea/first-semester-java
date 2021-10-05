public class Hat extends Garment {
    public int size = 10;
    public boolean isFunny = true;
    public String description = "Funny hat that is funny";

    public Hat(String name, int price) {
        super(name, price);
    }

    @Override
    public void printGarment() {
        System.out.println(this.name + " this is a hat");
    }

    @Override
    public String toString() {
        return "Hat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}

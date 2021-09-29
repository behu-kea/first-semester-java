public class Hat extends Garment implements Lol{
    public int size;

    public Hat(String name, int price, int size) {
        super(name, price);
        this.size = size;
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

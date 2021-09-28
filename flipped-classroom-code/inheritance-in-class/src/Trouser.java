public class Trouser extends Garment{
    public int length;

    public Trouser(String name, int price, int length) {
        super(name, price);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Trouser{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}

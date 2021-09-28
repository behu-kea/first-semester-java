public class Hat extends Garment{
    public int size;

    public Hat(String name, int price, int size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void printGarment() {
        System.out.println(this.name + " this is a hat");
    }
}

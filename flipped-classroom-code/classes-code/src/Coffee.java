public class Coffee {
    public String name;
    public int acidity;
    public CoffeeColor coffeeColor;

    public Coffee(String name, int acidity, CoffeeColor coffeeColor) {
        System.out.println(name);
        System.out.println(acidity);
        System.out.println("in constructor method");
        this.name = name;
        this.acidity = acidity;
        this.coffeeColor = coffeeColor;
    }

    public void buyCoffee() {
        System.out.println(this.name + " coffee bught");
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", acidity=" + acidity +
                ", coffeeColor=" + coffeeColor +
                '}';
    }
}

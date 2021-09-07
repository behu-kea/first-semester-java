class Cat {
    public String name;
    public int mood;
    public boolean isHungry;
    public int energy;

    public Cat(String name, int mood, boolean isHungry, int energy) {
        this.name = name;
        this.mood = mood;
        this.isHungry = isHungry;
        this.energy = energy;
    }

    public void meow() {
        System.out.println("meow");
    }
}
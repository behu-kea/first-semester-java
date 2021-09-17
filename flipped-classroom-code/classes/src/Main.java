public class Main {
    public static void main(String[] args) {
        /*
        String studentName = "Cathrine Hansson";
        int age = 23;
        int[] grades = {10, 4, 7, 7};

        String studentName2 = "Peter Jon";
        int age2 = 27;
        int[] grades2 = {12, 4, 4, 7};

        String studentName3 = "Peter Jon";
        int age3 = 27;
        int[] grades3 = {12, 4, 4, 7};

        String studentName4 = "Peter Jon";
        int age4 = 27;
        int[] grades4 = {12, 4, 4, 7};
        */

        /*
        Cat figaro = new Cat();
        System.out.println(figaro);
        figaro.name = "Figaro";
        figaro.mood = 10;
        figaro.energy = 100;
        figaro.isHungry = false;

        System.out.println(figaro.name);
        System.out.println(figaro.mood);
        System.out.println(figaro.energy);
        System.out.println(figaro.isHungry);
        figaro.meow();
        */

        Cat miauwi = new Cat("Miauwi", 3,true, 34);
        System.out.println(miauwi.name);
        System.out.println(miauwi.mood);
        System.out.println(miauwi.isHungry);

        Cat filo = new Cat("Filo", 3,true, 34);
        System.out.println(filo.name);
        System.out.println(filo.mood);
        System.out.println(filo.isHungry);

        System.out.println(filo);



    }
}

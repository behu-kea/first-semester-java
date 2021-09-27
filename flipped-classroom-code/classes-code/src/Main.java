public class Main {
    public static void main(String[] args) {
        Gender petersGender = Gender.female;
        petersGender = Gender.male;

        /*
        printMessage();
        printMessage();
*/
        Student samuelStudent = new Student("samuel", 22);
        System.out.println(samuelStudent);
        System.out.println(samuelStudent.lol);
        Admin jensNedeFraItKælderen = new Admin();
        //System.out.println(jensNedeFraItKælderen.createNewStudent());
/*
        Coffee arabicCoffee =  new Coffee("Arabic", 12, CoffeeColor.DARK);
        System.out.println(arabicCoffee);
        arabicCoffee.buyCoffee();

        /*
        Coffee danishCoffee =  new Coffee("danish", 3);
        System.out.println(danishCoffee);

        danishCoffee.buyCoffee();

         */
    }

    public static void printMessage() {
        System.out.println("hello");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}

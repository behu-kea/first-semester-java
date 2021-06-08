public class Main {
    // Purpose is to give a string and get a string back that is emojifyed
    public static String emojifyAString(String stringToEmojify) {
        System.out.println(stringToEmojify);
        return stringToEmojify.toUpperCase() + "🎉";
    }


    public static String getFullName(String firstname, String lastname) {
        String fullname = firstname + " " + lastname;
        return fullname;
    }

    public static void sayHi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        String name = "benjamin";

        String bejaminEmojified = emojifyAString("benjamin");
        String ahmedEmojified = emojifyAString("Ahmed");

        System.out.println(bejaminEmojified);
        System.out.println(ahmedEmojified);

        String firstname = "Ahmad";
        String lastname = "Hansen";
        String fullname = getFullName(firstname, lastname);
        String fullname2 = getFullName("asdsd", "askndjksdui");
        System.out.println(fullname);
        System.out.println(fullname2);

        sayHi();
    }


}

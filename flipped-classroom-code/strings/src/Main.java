public class Main {
    public static void main(String[] args) {
        String firstName = "Susanne";
        String lastName = "Jensen";

        char firstCharacter = firstName.charAt(0);
        System.out.println(firstCharacter);
        // Hvad bliver printet ud?

        String firstNameUppercase = firstName.toUpperCase();
        System.out.println(firstNameUppercase);

        System.out.println(firstName.contains("jam"));

        String fullname = firstName + " " + lastName;
        System.out.println(fullname);

        // There are 32 characters in Benjamin Hughes
        System.out.println("There are " + (fullname.length() - 1) + " characters in " + fullname);
    }
}

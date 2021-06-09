public class Main {
    public static String getLastElement(String[] arrayFromUser) {
        return arrayFromUser[arrayFromUser.length - 1];
    }

    public static void main(String[] args) {
        String[] usernames = {"duckduck23", "heyThere", "asd", "benaa"};
        String firstUsername = usernames[0];
        //System.out.println(firstUsername);
        String secondUsername = usernames[1];
        //System.out.println(secondUsername);

        //System.out.println(usernames.length);

        //usernames[1] = "heyThere23";
        //System.out.println(usernames[1]);
        String[] names = {"peeter", "cam"};
        String lastElement = getLastElement(names);
        System.out.println("Last element is: " + lastElement);
    }


}

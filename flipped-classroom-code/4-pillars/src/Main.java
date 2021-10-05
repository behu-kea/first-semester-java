public class Main {
    public static void main(String[] args) {
        User someUser = getUser();
        /*
        System.out.println(someUser.password);
        System.out.println(someUser.username);

        someUser.cpr = "asdasd";
        System.out.println(someUser.cpr);

         */

        someUser.generateNewPassword();
        // System.out.println(someUser.getUsername());
        someUser.setUsername("peter-the-man");
        // System.out.println(someUser.getUsername());


        // Polymorphism
        Geometry smallRectangle = new Rectangle(10, 20);
        // System.out.println(smallRectangle.getArea());
        Geometry smallCircle = new Circle(5);
        // System.out.println(smallCircle.getArea());

        Geometry[] geometries = {smallRectangle, smallCircle};
        for (Geometry geometry: geometries) {
            System.out.println(geometry.getArea());
        }



    }













    public static User getUser() {
        User peter = new User("peter123", "asd", "5673448-1234");
        return peter;
    }
}

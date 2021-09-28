public class Main {
    public static void main(String[] args) {
        Student peter = new Student(1, "Peter", true);
        Student henrik = new Student(2, "Henrik", false);
        Student mads = new Student(3, "Mads", true);
        Student[] englishStudents = {peter, henrik};

        SchoolClass english = new SchoolClass("english", englishStudents);
        int numberOfActiveEnglishStudents = english.getNumberOfActiveStudents();
        System.out.println(numberOfActiveEnglishStudents);



    }
}

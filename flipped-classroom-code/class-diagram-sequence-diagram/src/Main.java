public class Main {
    public static void main(String[] args) {
        // Creation of new students
        Student peter = new Student(1, "Peter", true);
        Student henrik = new Student(2, "Henrik", false);
        Student mads = new Student(3, "Mads", true);
        Student[] englishStudents = {peter, henrik, mads};

        SchoolClass english = new SchoolClass("english", englishStudents);
        int numberOfActiveEnglishStudents = english.getNumberOfActiveStudents();
        System.out.println(numberOfActiveEnglishStudents);

        /*
        SchoolClass[] classesInSchool = {english};

        School kea = new School("KEA", classesInSchool);
        kea.isStudentActive(mads);
*/
    }
}

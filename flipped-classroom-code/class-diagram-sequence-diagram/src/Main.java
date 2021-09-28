public class Main {
    public static void main(String[] args) {
        Student peter = new Student(1, "Peter");
        Student henrik = new Student(2, "Henrik");
        Student mads = new Student(3, "Mads");
        Student[] englishStudents = {peter, henrik};


        SchoolClass english = new SchoolClass("english", englishStudents);
        english.printStudents();

        SchoolClass 

    }
}

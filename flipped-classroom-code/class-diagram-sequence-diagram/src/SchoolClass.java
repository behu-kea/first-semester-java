public class SchoolClass {
    public String name;
    public Student[] studentsInClass;

    public SchoolClass(String name, Student[] studentsInClass) {
        this.name = name;
        this.studentsInClass = studentsInClass;
    }

    public void printStudents() {
        for (Student student: this.studentsInClass) {
            System.out.println(student);
        }
    }
}

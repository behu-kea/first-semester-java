public class School {
    public String name;
    public SchoolClass[] classes;

    public School(String name, SchoolClass[] classes) {
        this.name = name;
        this.classes = classes;
    }

    public boolean isStudentActive(Student student) {
        return student.isActive();
    }
}

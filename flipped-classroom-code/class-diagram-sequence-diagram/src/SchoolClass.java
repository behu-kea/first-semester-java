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

    public int getNumberOfActiveStudents() {
        int numberOfActiveStudents = 0;
        for (Student student: this.studentsInClass) {
            if(student.isActive()) {
                numberOfActiveStudents++;
            }
        }

        return numberOfActiveStudents;
    }
}

public class School {
    private String name;
    private Student[] students;

    public void setStudent(Student[] students) {
        this.students = students;
    }

    public Student[] getStudent() {
        return students;
    }

    public School(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

}

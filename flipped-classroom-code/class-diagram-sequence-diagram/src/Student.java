public class Student extends MasterStudent {
    public String name;

    public Student(int id, String name) {
        super(id);
        this.name = name;
    }

    public boolean isPresent() {
        return true;
    }
}

public class Student extends MasterStudent {
    public String name;
    public boolean isActive;

    public Student(int id, String name, boolean isActive) {
        super(id);
        this.name = name;
        this.isActive = isActive;
    }

    public boolean isPresent() {
        return true;
    }

    public boolean isActive() {
        return this.isActive;
    }
}

package E10_12;
public class Student extends Person {
    private String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}

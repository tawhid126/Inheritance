package E10_12;
public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 2000, "Computer Science");
        Instructor instructor = new Instructor("Jane Smith", 1975, 75000);

        System.out.println(student);
        System.out.println(instructor);
    }
}


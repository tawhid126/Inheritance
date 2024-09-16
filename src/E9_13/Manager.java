package E10_13;
public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getdepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Manager[name=" + getName() + ", department=" + department + ", salary=" + getSalary() + "]";
    }
}


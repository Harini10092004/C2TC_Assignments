package Assignment1.employees;

public class Manager extends Employee {
    private String department;

    public Manager(String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);   // Call Employee constructor
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

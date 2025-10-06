package Assignment1.utilities;

import Assignment1.employees.Employee;

public class EmployeeUtilities {

    // Display details of any employee
    public static void displayEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    // Increase salary
    public static void increaseSalary(Employee emp, double amount) {
        emp.setSalary(emp.getSalary() + amount);
    }
}

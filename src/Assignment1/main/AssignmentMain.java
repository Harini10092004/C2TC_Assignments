package Assignment1.main;

import Assignment1.employees.Developer;
import Assignment1.employees.Manager;
import Assignment1.utilities.EmployeeUtilities;

/**
 * Main class to test employees.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager
        Manager mgr = new Manager("Alice", "M101", 80000, "HR");

        // Create Developer
        Developer dev = new Developer("Bob", "D202", 60000, "Java");

        // Display Manager details
        System.out.println("=== Manager Details ===");
        EmployeeUtilities.displayEmployeeDetails(mgr);
        System.out.println("Department: " + mgr.getDepartment());

        // Display Developer details
        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.displayEmployeeDetails(dev);
        System.out.println("Language: " + dev.getProgrammingLanguage());

        // Increase salary of developer
        EmployeeUtilities.increaseSalary(dev, 5000);
        System.out.println("\nAfter salary increase:");
        EmployeeUtilities.displayEmployeeDetails(dev);
    }
}

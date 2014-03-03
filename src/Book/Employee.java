import acm.program.*;
import acm.util.*;

/**
 * Store data about an employee.
 */
public class Employee {

    public Employee(String name, String supervisor, double salary) {
        this.name = name;
        this.supervisor = supervisor;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupervisor() {
        return this.supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String name;
    private String supervisor;
    private double salary;

}


class EmployeeTester extends ConsoleProgram {

    public void run() {
        Employee emp = new Employee("Joe Blow", "Jimmy Bean", 90000.00);
        println(emp.getName());
        println(emp.getSupervisor());
        println(emp.getSalary());
    }

}

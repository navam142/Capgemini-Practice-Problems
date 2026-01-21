package oopsproblems;

interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}


abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
    }

    public void assignDepartment(String department) { this.department = department; }
    public String getDepartmentDetails() { return department; }
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Salary: " + calculateSalary());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(1, "John Doe", 50000, 10000);
        fullTimeEmployee.assignDepartment("HR");
        fullTimeEmployee.displayDetails();
        System.out.println();

        Employee partTimeEmployee = new PartTimeEmployee(2, "Jane Doe", 20000, 20, 500);
        partTimeEmployee.assignDepartment("Marketing");
        partTimeEmployee.displayDetails();
    }
}

package constructor.level1.accessmodifiers;

public class Employee {
    public Integer employeeId;
    protected String department;
    private Integer salary;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
    public static void main(String[] args) {
        Manager navam = new Manager();
        navam.employeeId = 1234;
        navam.department = "IT";
        navam.setSalary(100000);
        navam.displayEmployeeDetails();
    }
}

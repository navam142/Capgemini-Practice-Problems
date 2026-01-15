package classesandobjects.level1;

public class Employee {
    String name;
    Integer id;
    Integer salary;

    Employee (String name, Integer id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("name : " + this.name + "\nid: " + this.id + "\nsalary: " + this.salary );
    }
    public static void main(String[] args) {
        Employee navam = new Employee("Navam", 001, 250000);
        navam.displayDetails();
    }
}
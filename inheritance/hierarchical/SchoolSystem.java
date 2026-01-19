package inheritance.hierarchical;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    public void showTeacherDetails() {
        showBasicInfo();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
    }

    public void showStudentDetails() {
        showBasicInfo();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
    }

    public void showStaffDetails() {
        showBasicInfo();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Aman", 35, "Mathematics");
        Student s1 = new Student("Navam", 20, "3rd Year");
        Staff st1 = new Staff("Ravi", 40, "Administration");

        t1.displayRole();
        t1.showTeacherDetails();

        System.out.println();

        s1.displayRole();
        s1.showStudentDetails();

        System.out.println();

        st1.displayRole();
        st1.showStaffDetails();
    }
}

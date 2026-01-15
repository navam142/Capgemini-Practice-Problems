package classesandobjects.level2;

public class Student {
    String name;
    Integer id;
    Integer marks;

    public Student(String name, Integer id, Integer marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public Character getGrade(Integer marks) {
        
        if (marks >= 0 && marks < 33) {
            return 'F';
        }
        if (marks >= 33 && marks < 50) {
            return 'D';
        }
        if (marks >= 50 && marks < 65) {
            return 'C';
        }
        if (marks >= 65 && marks < 85) {
            return 'B';
        } 
        if (marks >= 85 && marks <= 100) {
            return 'A';
        }
        return 'z';
    }

    public void displayDetails() {
        System.out.println("name : " + this.name + "\nid: " + this.id + "\ngrade : " + getGrade(marks));
    }

    public static void main(String[] args) {
        Student navam = new Student("Navam", 1, 91);
        navam.displayDetails();
    }
}

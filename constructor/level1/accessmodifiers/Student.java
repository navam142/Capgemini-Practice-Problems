package constructor.level1.accessmodifiers;

public class Student {
    Integer rollNumber;
    protected String name;
    private Double CGPA;

    public Double getCGPA() {
        return CGPA;
    }

    public void setCGPA(Double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(String name, Integer rollNumber, Double CGPA) {
        this.name = name;
        this.rollNumber = rollNumber;
        setCGPA(CGPA);
    }

    void displayPostgraduateStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent navam = new PostgraduateStudent("Navam", 1234, 9.5);
        navam.displayPostgraduateStudentDetails();
        System.out.println();
    }
}    

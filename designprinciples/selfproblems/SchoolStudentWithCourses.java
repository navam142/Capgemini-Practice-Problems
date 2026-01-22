package designprinciples.selfproblems;

import java.util.*;

class Student {
    private int id;
    private String name;
    private List<Course> courses; 

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); 
        }
    }

    public void showEnrolledCourses() {
        System.out.println("\n🎓 Student: " + name + " (ID: " + id + ")");
        if (courses.isEmpty()) {
            System.out.println("Not enrolled in any course.");
            return;
        }
        System.out.println("Enrolled Courses:");
        courses.forEach(c -> System.out.println("- " + c.getCourseName()));
    }
}

class Course {
    private String courseCode;
    private String courseName;
    private List<Student> students; 

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("\n📘 Course: " + courseName + " (" + courseCode + ")");
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }
        System.out.println("Enrolled Students:");
        students.forEach(s -> System.out.println("- " + s.getName() + " (ID: " + s.getId() + ")"));
    }
}

class School {
    private String schoolName;
    private List<Student> students; 

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void showSchoolStudents() {
        System.out.println("\n🏫 School: " + schoolName);
        if (students.isEmpty()) {
            System.out.println("No students in this school.");
            return;
        }
        System.out.println("Students List:");
        students.forEach(s -> System.out.println("- " + s.getName() + " (ID: " + s.getId() + ")"));
    }
}


public class SchoolStudentWithCourses {
    public static void main(String[] args) {

        Course java = new Course("CS101", "Java Programming");
        Course dsa = new Course("CS201", "Data Structures");
        Course dbms = new Course("CS301", "DBMS");

        Student navam = new Student(1, "Navam");
        Student rahul = new Student(2, "Rahul");
        Student priya = new Student(3, "Priya");

        School chitkara = new School("Chitkara University");
        chitkara.addStudent(navam);
        chitkara.addStudent(rahul);
        chitkara.addStudent(priya);

        navam.enrollInCourse(java);
        navam.enrollInCourse(dsa);

        rahul.enrollInCourse(java);
        rahul.enrollInCourse(dbms);

        priya.enrollInCourse(dsa);

        chitkara.showSchoolStudents();

        navam.showEnrolledCourses();
        rahul.showEnrolledCourses();
        priya.showEnrolledCourses();

        java.showEnrolledStudents();
        dsa.showEnrolledStudents();
        dbms.showEnrolledStudents();
    }
}


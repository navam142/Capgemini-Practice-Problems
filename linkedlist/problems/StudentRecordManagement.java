package linkedlist.problems;
import linkedlist.nodes.*;

class Student {
    Integer rollNumber, age;
    String name;
    Character grade;

    Student (Integer rollNumber, String name, Integer age, Character grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "name : " + this.name + ", rollNumber : " + this.rollNumber + ", age : " + this.age + ", grade : " + this.grade;
    }
}

public class StudentRecordManagement {
    
    public static void main(String[] args) {
        SinglyLinkedList<Student> sll = new SinglyLinkedList<Student>();
        Student navam = new Student(1234, "Navam Sharma", 21, 'A');
        Student shivam = new Student(4567, "Shivam", 20, 'A');
        sll.insertAtTail(navam);
        sll.insertAtTail(shivam);
        sll.displayAllNodes();

        System.out.println(sll.searchIf(student -> student.rollNumber == 1234));

        sll.deleteIf(obj -> obj.rollNumber == 1234);
        sll.displayAllNodes();
    }
}

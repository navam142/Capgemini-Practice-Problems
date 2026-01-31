package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

class Student {
    int id, marks;
    String name;
    Student (int id, String name, int marks) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        Student s1 = new Student(0,"Navam" ,20);
        Student s2 = new Student(1,"Shivam" ,30);
        Student s3 = new Student(3, "Raman",50);
        Student s4 = new Student(4,"Aman" ,100);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size(); j < list.size() - i - 1; j++) {
                Student temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
            }
        }
        for (Student s : list) {
            System.out.println(s.name + " : " + s.marks);
        }
    }
}

package generics.coursemanagementsystem;

import java.util.List;

class University {

    public static void showAllCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println("Evaluation: " + c.evaluationMethod());
        }
    }
}


abstract class CourseType {
    abstract String evaluationMethod();
}

class ExamCourse extends CourseType {
    @Override
    String evaluationMethod() {
        return "Final Exam + Midterm Exam";
    }
}

class AssignmentCourse extends CourseType {
    @Override
    String evaluationMethod() {
        return "Assignments + Quizzes";
    }
}

class ResearchCourse extends CourseType {
    @Override
    String evaluationMethod() {
        return "Research Paper + Presentation";
    }
}

class Course<T extends CourseType> {

    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public void showCourseDetails() {
        System.out.println(
            courseName + " | Evaluation: " + courseType.evaluationMethod()
        );
    }

    public T getCourseType() {
        return courseType;
    }
}



public class Main {
    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd =
                new Course<>("AI Research", new ResearchCourse());

        math.showCourseDetails();
        cs.showCourseDetails();
        phd.showCourseDetails();
    }
}

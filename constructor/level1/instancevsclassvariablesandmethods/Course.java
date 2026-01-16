package constructor.level1.instancevsclassvariablesandmethods;

public class Course {
    String name;
    Integer duration, fee;
    static String institueName;

    Course(String name, Integer duration, Integer fee, String institueName) {
        this.name = name;
        this.duration = duration;
        this.fee = fee;
        Course.institueName = institueName;
    }

    static String updateInstitueName(String name) {
        institueName = name;
        return institueName;
    }
    void displayCourseDetails() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Duration: " + duration);
        System.out.println("Course Fee: " + fee);
        System.out.println("Institue Name: " + institueName);
    }
    public static void main(String[] args) {
        Course dsa = new Course("DSA", 6, 800000, "Chitkara");
        dsa.displayCourseDetails();
        System.out.println();
        updateInstitueName("Chitkara University");
        System.out.println("Updated Institue Name: " + institueName);
    }
}

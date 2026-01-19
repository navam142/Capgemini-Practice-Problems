package inheritance.multilevel;

class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseType() {
        return "Basic Course";
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String getCourseType() {
        return "Online Course";
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public String getCourseType() {
        return "Paid Online Course";
    }

    public double finalPrice() {
        return fee - (fee * discount / 100);
    }
}


public class EducationalCourse {
    public static void main(String[] args) {
        Course c1 = new Course("C Programming", 20);
        OnlineCourse c2 = new OnlineCourse("Java DSA", 40, "YouTube", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("System Design", 30, "Udemy", true, 999, 20);

        System.out.println(c1.getCourseType());
        System.out.println(c2.getCourseType());
        System.out.println(c3.getCourseType());

        System.out.println("Final Price: ₹" + c3.finalPrice());
    }
}

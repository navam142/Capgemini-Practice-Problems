package constructor.level1;

public class Circle {
    Double radius;

    Circle() {
        this.radius = 1.0;
    }

    Circle(Double radius) {
        this.radius = radius;
    }

    Double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getArea());
        Circle c1 = new Circle(5.0);
        System.out.println(c1.getArea());
    }
}

public class Circle extends Shape {
    private double radius;

    public Circle(Point p, double radius) {
        super(p);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

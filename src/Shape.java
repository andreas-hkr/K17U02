public abstract class Shape {
    private Point p;

    public Shape(Point p) {
        this.p = p;
    }

    public abstract double area();
}

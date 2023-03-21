public class Main {
    public static void main(String[] args) {
        // Skapa en klass Point som har två instansvaraibler, x och y
        // Skapa en klass Shape som har en Point, och en abstrakt metod area
        //
        // Skapa en klass Circle som ärver från Shape, och dessutom har en radie
        // Skapa en klass Rectangle som ärver från Shape, och dessutom har en bredd och höjd
        //
        // Skapa några objekt av dessa två klasser och lägg dem i en array
        // Skriv ut alla objekt i arrayens area

        Shape[] shapes = {
                new Circle(new Point(5, 7),5),
                new Rectangle(new Point(12,3),4, 9),
                new Rectangle(new Point(20,10),8, 12)
        };

        for (var shape : shapes) {
            System.out.format("Area: %.2f%n", shape.area());
        }
    }
}
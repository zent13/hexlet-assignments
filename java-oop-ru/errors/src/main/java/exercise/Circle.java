package exercise;

// BEGIN
public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
//        System.out.println("returned Radius: " + this.radius);
        return this.radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (this.getRadius() < 0) {
            throw new NegativeRadiusException("Radius less than zero");
        }

        double square = Math.PI * radius * radius;
//        System.out.println("returned Square: " + square);
        return square;
    }
}
// END

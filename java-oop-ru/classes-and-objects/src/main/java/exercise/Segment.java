package exercise;

// BEGIN
public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getBeginPoint() {
        return p1;
    }

    public Point getEndPoint() {
        return p2;
    }

    public Point getMidPoint() {
        int startMidX = (this.getBeginPoint().getX() + this.getEndPoint().getX()) / 2;
        int endMidY = (this.getBeginPoint().getY() + this.getEndPoint().getY()) / 2;

        return new Point(startMidX, endMidY);
    }
}
// END

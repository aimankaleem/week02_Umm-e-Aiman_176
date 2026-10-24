
public class Point {
    private final double x;
    private final double y;

    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy a null Point.");
        }
        this.x = other.x;
        this.y = other.y;
    }

    public double distanceTo(Point other) {
        if (other == null) {
            throw new IllegalArgumentException("Target point cannot be null.");
        }
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return String.format("Point(%.1f, %.1f)", x, y);
    }
}

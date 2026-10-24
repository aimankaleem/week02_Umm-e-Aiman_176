
public class Rectangle {
    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        if (topLeft == null) {
            throw new IllegalArgumentException("Top-left coordinate cannot be null.");
        }
        if (width <= 0.0 || height <= 0.0) {
            throw new IllegalArgumentException("Width and height must both be strictly positive.");
        }
        this.topLeft = new Point(topLeft);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(Point p) {
        if (p == null) return false;
        boolean withinX = (p.getX() >= topLeft.getX()) && (p.getX() <= topLeft.getX() + width);
        boolean withinY = (p.getY() <= topLeft.getY()) && (p.getY() >= topLeft.getY() - height);
        return withinX && withinY;
    }

    public Point getTopLeft() {
        return new Point(this.topLeft);
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public String toString() {
        return String.format("Rectangle[TopLeft=%s, Width=%.1f, Height=%.1f, Area=%.1f]", 
                topLeft, width, height, calculateArea());
    }
}
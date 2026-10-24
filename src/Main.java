
public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       WEEK 2 LAB: OBJECT MODELING & DEFENSE      ");
        System.out.println("==================================================");

        // 1. Point Distance Testing
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
        System.out.printf("Distance between P1 and P2: %.2f (Expected: 5.00)%n", p1.distanceTo(p2));

        // 2. Rectangle Creation & Geometry
        System.out.println("\n--- Testing Rectangle Geometry ---");
        Point origin = new Point(1.0, 5.0);
        Rectangle rect = new Rectangle(origin, 6.0, 4.0);
        System.out.println(rect);
        System.out.println("Perimeter: " + rect.calculatePerimeter());

        // 3. Testing Containment Logic
        Point insidePoint = new Point(3.0, 3.0);
        Point outsidePoint = new Point(8.0, 6.0);
        System.out.printf("Does rect contain %s? %b (Expected: true)%n", insidePoint, rect.contains(insidePoint));
        System.out.printf("Does rect contain %s? %b (Expected: false)%n", outsidePoint, rect.contains(outsidePoint));

        // 4. Proving Reference Independence / Defensive Copying
        System.out.println("\n--- Defensive Copying Proof ---");
        Point extractedPoint = rect.getTopLeft();
        System.out.println("Extracted TopLeft: " + extractedPoint);
        System.out.println("Are memory addresses identical? " + (extractedPoint == origin ? "YES (LEAK!)" : "NO (DEFENSIVE COPY SAFE)"));

        // 5. Invariant Failure Testing
        System.out.println("\n--- Testing Constructor Validation Guards ---");
        try {
            System.out.println("Attempting to construct Rectangle with negative width (-4)...");
            new Rectangle(new Point(0, 0), -4, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Invariant Guard: " + e.getMessage());
        }
    }
}
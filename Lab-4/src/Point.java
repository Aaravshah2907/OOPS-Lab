public class Point {

    private double x; // x-coordinate
    private double y; // y-coordinate

    // Constructor
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Accessor and Mutator methods
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    // String representation
    public String toString() {
        return "X=" + x + ", Y=" + y;
    }

    // Method to modify the state of the object
    public static void changeState(Point other) {
        other.setX(-20);
        other.setY(-20);
    }

    // Method to change the reference of the object
    public static void changeReference(Point other) {
        other = new Point(-20, -20); // Reference change won't affect the caller
    }
}

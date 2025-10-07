public class Circle {

    static double PI; // Class variable shared across all instances
    private double radius;

    // Overloaded constructor
    Circle(double radius) {
        this.radius = radius;
        Circle.PI = 3.141; // Assign value to static variable
    }

    // Accessor method
    public double getRadius() {
        return radius;
    }

    // Mutator method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double area() {
        return (PI * radius * radius);
    }

    // Static method to calculate circumference
    public static void getCircumference(double radius) {
        System.out.println("Circumference = " + (2 * PI * radius));
    }
}

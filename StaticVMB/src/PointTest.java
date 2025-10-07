class Point {
	private double x; // x-coordinate
	private double y; // y-coordinate
// Constructor 

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

// Accessor and Mutator methods 
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

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

public class PointTest {
	public static void main(String[] args) { 
		// Pass-by-Reference: Modifying object state 
		Point p1 = new Point(10, 20); 
		System.out.println("Before changeState: " + p1); 
		Point.changeState(p1); // Modifies the same object 
		System.out.println("After changeState: " + p1); 
		// Pass-by-Value: Attempting to change the reference  
		Point p2 = new Point(100, 200); 
		System.out.println("Before changeReference: " + p2); 
		Point.changeReference(p2); // Reference change has no effect 
		System.out.println("After changeReference: " + p2); 
	}
}

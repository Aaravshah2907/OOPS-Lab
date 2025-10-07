package lab6_SC;

public class circle { // Save as "Circle.java"
	// Private variables
	private double radius;
	private String color;
	// Constructors (overloaded)
	public circle() { // 1st Constructor
	radius = 1.0;
	color = "red";
	}
	public circle(double r) { // 2nd Constructor
	radius = r;
	color = "red";
	}
	public circle(double r, String c) { // 3rd Constructor
	radius = r;
	color = c;
	}
	// Public methods
	public double getRadius() {
	return radius;
	}
	public String getColor() {
	return color;
	}
	public double getArea() {
	return radius * radius * Math.PI;
	}
	}


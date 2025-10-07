package lab6_SC;

public class cylinder extends circle {
	private double height;
	public cylinder() { // constructor 1
		super(); // invoke superclass' constructor Circle()
		height = 1.0;
		}
		public cylinder(double radius, double height) { // Constructor 2
		super(radius); // invoke superclass' constructor Circle(radius)
		this.height = height;
		}
		public double getHeight() {
		return height;
		}
		public void setHeight(double height) {
		this.height = height;
		}
		public double getVolume() {
		return getArea() * height; // Use Circle's getArea()
		}
}

class BOX {
	private double length, width, height;

// Constructor 
	BOX(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}

// Mutator and Accessor Methods 
	public void setLength(double l) {
		length = l;
	}

	public void setWidth(double w) {
		width = w;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public String toString() {
		return "Length=" + length + ", Width=" + width + ", Height=" + height;
	}

	public static void swapBoxes(BOX b1, BOX b2) {
		BOX temp = b1;
		b1 = b2;
		b2 = temp;
	}
}

public class BoxTest {
	// Main 1
	/*
	 * public static void main(String[] args) { BOX b1 = new BOX(10, 40, 60); BOX b2
	 * = new BOX(20, 30, 80); System.out.println("Before swapping:");
	 * System.out.println("Box 1: " + b1); System.out.println("Box 2: " + b2);
	 * BOX.swapBoxes(b1, b2); // This won't swap the objects
	 * System.out.println("After swapping:"); System.out.println("Box 1: " + b1);
	 * System.out.println("Box 2: " + b2); }
	 */

	// Main 2

	public static void main(String[] args) {
		BOX b1 = new BOX(10, 40, 60);
		BOX b2 = new BOX(20, 30, 80);
		System.out.println("Before swapping:");
		System.out.println("Box 1: " + b1);
		System.out.println("Box 2: " + b2);
		BOX temp = b1; // Swapping locally
		b1 = b2;
		b2 = temp;
		System.out.println("After swapping:");
		System.out.println("Box 1: " + b1);
		System.out.println("Box 2: " + b2);
	}

}

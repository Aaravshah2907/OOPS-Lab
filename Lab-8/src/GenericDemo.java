import java.util.List;

//[1] Generic Class with Upper Bound 
class Box<T extends Number> { // Fill: T extends Number
	private T value; // Fill: T

	public void set(T value) { // Fill: T
		this.value = value;
	}

	public T get() { // Fill: T
		return value;
	}

	public void printDouble() {
		System.out.println("Double value: " + value.doubleValue());
	}
}

//[2] Generic Method 
class Printer {
	public static <T> void printArray(T[] array) { // Fill: T, T
		for (T item : array) { // Fill: T
			System.out.println("Item: " + item);
		}
	}
}

public class GenericDemo {

	// [3] Upper Bound Wildcard – reading only
	public static void printNumbers(List<? extends Number> list) { // Fill: extends
		for (Number num : list) {
		}
		System.out.println("Read: " + num.doubleValue());
	}

// [4] Lower Bound Wildcard – safe for writing integers 
	public static void addIntegers(List<? super Integer> list) { // Fill: super
		list.add(10);
		list.add(20);
		System.out.println("Added integers to list.");
	}

	public static void main(String[] args) {
// Using Generic Class 
		Box<Integer> intBox = new Box<>(); // Fill: Integer
		intBox.set(42);
		System.out.println("Box contains: " + intBox.get());
		intBox.printDouble();
		Box<Double> doubleBox = new Box<>(); // Fill: Double
		doubleBox.set(3.14);
		doubleBox.printDouble();
	}
}
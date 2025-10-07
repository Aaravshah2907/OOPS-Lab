import java.util.*;


public class BoundsDemo {

	// Upper Bound
	public static void PrintList(List<? extends Number> list) {
		for (Number num : list) {
			System.out.println("Read : " + num.doubleValue());
		}
	}

	// Lower Bound
	public static void addIntegers(List<? super Integer> list) {
		list.add(100);
		list.add(200);
		System.out.println("Added to list....");
	}

	public static void main(String[] args) {

		// Upper BOund Example 1
		List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
		PrintList(doubleList);

		// Lower Bound Example 1
		List<Number> numberList = new ArrayList<>();
		addIntegers(numberList);

		PrintList(numberList);
	}
}

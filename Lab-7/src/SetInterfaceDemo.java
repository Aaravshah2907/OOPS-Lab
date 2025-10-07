import java.util.*;

public class SetInterfaceDemo {
	public static void main(String[] args) {
		
		// Create a HashSet (which implements the Set interface)
		Set<String> set = new HashSet<>();
		
		// Add elements to the set
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple"); // Duplicate, will not be added

		// Display the set elements
		System.out.println("Set elements: " + set); // Output: [Apple, Banana, Cherry] or a permutation of this.
		boolean containsBanana = set.contains("Banana");// Check if the set contains 'Banana'
		System.out.println("Set contains 'Banana': " + containsBanana); // Output: true
		set.remove("Banana");// Remove an element from the set
		System.out.println("After removing 'Banana': " + set); // Output: [Apple, Cherry]
		int size = set.size();// Get the size of the set
		System.out.println("Size of the set: " + size); // Output: 2
		set.clear();// Clear the set
		System.out.println("Set after clear(): " + set); // Output: []
	}
}
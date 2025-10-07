import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// Creating an ArrayList
		ArrayList<String> fruits = new ArrayList<>();
		// Adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Mango");
		fruits.add("Banana"); 
		
		// Duplicates allowed
		System.out.println("Original List: " + fruits);
		
		// Getting an element by index
		System.out.println("Element at index 2: " + fruits.get(2));
		
		// Modifying an element
		fruits.set(1, "Blueberry");
		System.out.println("After modification: " + fruits);
		
		// Removing elements
		fruits.remove("Cherry"); // Remove by value
		fruits.remove(2); // Remove by index
		System.out.println("After removal: " + fruits);
		
		// Checking if an element exists
		System.out.println("Contains Mango? " + fruits.contains("Mango"));
		
		// Finding the size of the ArrayList
		System.out.println("Size of list: " + fruits.size());
		
		// Sorting the ArrayList
		Collections.sort(fruits);
		System.out.println("Sorted List: " + fruits);
		
		// Looping through the list (Using for-each loop)
		System.out.print("Using for-each loop: ");
		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		System.out.println();
		
		// Looping using for loop with index
		System.out.print("Using for loop: ");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i) + " ");
		}
		System.out.println();
		
		// Converting ArrayList to Array
		String[] fruitArray = fruits.toArray(new String[0]);
		System.out.println("Converted to Array: " + java.util.Arrays.toString(fruitArray));
		
		// Clearing the ArrayList
		fruits.clear();
		System.out.println("After clearing: " + fruits);
		
		// Checking if the list is empty
		System.out.println("Is list empty? " + fruits.isEmpty());
	}

}

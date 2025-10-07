import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListEx {
	public static void main(String[] args) {
		
		// Creating a LinkedList
		LinkedList<String> names = new LinkedList<>();
		
		// Adding elements
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		System.out.println("Original List: " + names);
		
		// Adding elements at specific positions
		names.addFirst("Zara"); // Adds at the beginning
		names.addLast("Emma"); // Adds at the end
		names.add(2, "Mia"); // Inserts at index 2
		System.out.println("After additions: " + names);
		
		// Accessing elements
		System.out.println("First Element: " + names.getFirst());
		System.out.println("Last Element: " + names.getLast());
		System.out.println("Element at index 3: " + names.get(3));
		
		// Modifying elements
		names.set(2, "Sophia"); // Replace element at index 2
		System.out.println("After modification: " + names);
		
		// Removing elements
		names.removeFirst(); // Remove first element
		names.removeLast(); // Remove last element
		names.remove(2); // Remove element at index 2
		System.out.println("After removals: " + names);
		
		// Checking properties
		System.out.println("Contains 'Charlie'? " + names.contains("Charlie"));
		System.out.println("Size of list: " + names.size());
		System.out.println("Is list empty? " + names.isEmpty());
		
		// Searching elements
		System.out.println("Index of 'Bob': " + names.indexOf("Bob"));
		System.out.println("Last index of 'Bob': " + names.lastIndexOf("Bob"));
		
		// Sorting & Reversing
		Collections.sort(names);
		System.out.println("Sorted List: " + names);
		Collections.reverse(names);
		System.out.println("Reversed List: " + names);
		
		// Converting to Array
		String[] namesArray = names.toArray(new String[0]);
		System.out.println("Converted to Array: " + java.util.Arrays.toString(namesArray));
		
		// Iterating over elements using for-each loop
		System.out.print("Using for-each loop: ");
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		// Iterating using iterator
		System.out.print("Using Iterator: ");
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		// Deque-Specific Methods (Queue Operations)
		names.offer("Oliver"); // Adds at the end
		names.offerFirst("Jack"); // Adds at the front
		names.offerLast("Liam"); // Adds at the end
		System.out.println("After offer methods: " + names);
		System.out.println("Peek (first element): " + names.peek());
		System.out.println("Poll (remove first element): " + names.poll());
		System.out.println("PollLast (remove last element): " + names.pollLast());
		
		// Clearing the list
		names.clear();
		System.out.println("After clearing: " + names);
		System.out.println("is empty ? " + names.isEmpty());
	}
}

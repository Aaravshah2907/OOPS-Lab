import java.util.*;

public class Ex2List {
	public static void main(String[] args) {
		// Create a list for names
		List<String> names = new ArrayList<>();

		// Add elements
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		names.add("Eve");

		// Iterating using for-each
		System.out.println("Using for-each loop:");
		for (String name : names) {
			System.out.println(name);
		}

		// Iterating using for loop
		System.out.println("\nUsing for loop with index:");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		// Iterate using an Iterator
		System.out.println("\nUsing Iterator:");
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Iterate using a Lambda Expression (forEach) 
        System.out.println("\nUsing Lambda Expression:"); 
        names.forEach(name -> System.out.println(name));

	}
}

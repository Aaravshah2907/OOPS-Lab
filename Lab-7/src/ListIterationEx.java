import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ListIterationEx {
	public static void main(String[] args) {
		
		// Create a List of names
		List<String> names = new ArrayList<>();
		
		// Add elements to the list
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		names.add("Eve");
		
		// Iterate using a for-each loop
		System.out.println("Using for-each loop:");
		for (String name : names) {
			System.out.println(name);
		}
		
		// Iterate using a for loop with an index
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
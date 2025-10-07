import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		// Create a LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		
		// Add key-value pairs to the LinkedHashMap
		linkedHashMap.put("Apple", 50);
		linkedHashMap.put("Banana", 30);
		linkedHashMap.put("Cherry", 20);
		
		// Display the LinkedHashMap (in insertion order)
		System.out.println("LinkedHashMap: " + linkedHashMap);
		
		// Access the 'Banana' key to demonstrate order (default insertion order)
		int bananaVal = linkedHashMap.get("Banana");
		System.out.println(bananaVal);
		
		// Add another entry to demonstrate order persistence
		linkedHashMap.put("Date", 40);
		System.out.println("LinkedHashMap after adding Date: " + linkedHashMap);
		
		// Remove an entry
		linkedHashMap.remove("Apple");
		System.out.println("LinkedHashMap after removing Apple: " + linkedHashMap);
		
		// Iterating through the LinkedHashMap
		System.out.println("Iterating over LinkedHashMap:");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println("\t" + entry.getKey() + " = " + entry.getValue());
		}
	}
}

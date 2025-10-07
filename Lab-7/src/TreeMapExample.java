import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {

		// Create a TreeMap
		TreeMap<Integer, String> treeMap = new TreeMap<>();

		// Adding elements
		treeMap.put(10, "Apple");
		treeMap.put(20, "Mango");
		treeMap.put(30, "Banana");
		treeMap.put(40, "Orange");
		treeMap.put(50, "Grapes");

		// Displaying
		System.out.println("treeMap : " + treeMap);

		// Navigation Methods
		System.out.println("First Key: " + treeMap.firstKey()); // 10
		System.out.println("Last Key: " + treeMap.lastKey()); // 50
		System.out.println("Higher Key (20): " + treeMap.higherKey(20)); // 30 (exclusive)
		System.out.println("Lower Key (30): " + treeMap.lowerKey(30)); // 20 (exclusive)
		System.out.println("Ceiling Key (25): " + treeMap.ceilingKey(25)); // 30 
		System.out.println("Floor Key (25): " + treeMap.floorKey(25));

		// Entry navigation
		System.out.println("First Entry: " + treeMap.firstEntry());
		System.out.println("Last Entry: " + treeMap.lastEntry());

		// Removing first and last entries
		System.out.println("Poll First Entry: " + treeMap.pollFirstEntry());
		System.out.println("Poll Last Entry: " + treeMap.pollLastEntry());

		// Display TreeMap after polling
		System.out.println("TreeMap after polling: " + treeMap);

		// Sub-maps and Range Queries
		System.out.println("HeadMap (less than 30): " + treeMap.headMap(30)); // exclusive
		System.out.println("TailMap (from 30 onwards): " + treeMap.tailMap(30)); // inclusive
		System.out.println("SubMap (20 to 40): " + treeMap.subMap(20, 40)); // 20 inclusive; 40 exclusive
	}
}

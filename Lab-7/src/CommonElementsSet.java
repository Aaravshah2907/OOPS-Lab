import java.util.*;

public class CommonElementsSet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creating sets to store unique numbers
		Set<Integer> set1 = new HashSet<>(); // Choose the correct Set implementation
		Set<Integer> set2 = new HashSet<>(); // Choose the correct Set implementation
		System.out.println("Enter numbers for first set (type -1 to stop):");
		while (true) {
			int num = scanner.nextInt();
			if (num == -1)
				break;
			set1.add(num); // Add to first set
		}
		System.out.println("Enter numbers for second set (type -1 to stop):");
		while (true) {
			int num = scanner.nextInt();
			if (num == -1)
				break;
			set2.add(num); // Add to second set
		}
		// Finding common elements
		Set<Integer> commonElements = new HashSet<>(set1); // Initialize with set1
		commonElements.retainAll(set2); // Retain only common elements
		System.out.println("Common Elements: " + commonElements);
		System.out.println("Total Common Elements: " + commonElements.size()); // Print size
	}
}
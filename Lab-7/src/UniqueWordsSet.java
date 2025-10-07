import java.util.*;

public class UniqueWordsSet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Choose the correct Set implementation
		Set<String> words = new HashSet<>();
		
		
		System.out.println("Enter words (type 'exit' to stop):");
		while (true) {
			String word = scanner.next();
			if (word.equalsIgnoreCase("exit"))
				break;
			words.add(word);
		}
		
		System.out.println("Unique Words (Sorted): " + words);
		// Print set size
		System.out.println("Size of set : " + words.size());
		
		scanner.close();
	}
}

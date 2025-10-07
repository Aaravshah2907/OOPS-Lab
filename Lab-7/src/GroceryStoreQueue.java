import java.util.*;

public class GroceryStoreQueue {
	public static void main(String[] args) {
		// Step 1: Create a queue for customers
		Queue<String> checkoutQueue = new LinkedList<>();
		// Step 2: Add 2 customers to the queue
		checkoutQueue.offer("Alice");
		checkoutQueue.offer("Bob");
		// Step 3: Process each customer in the queue
		System.out.println("Serving customers at checkout...");
		while (!checkoutQueue.isEmpty()) {
			String customer = checkoutQueue.poll(); // Serve the first customer
			System.out.println("Checking out: " + customer);
		}
		// Step 4: All customers checked out
		System.out.println("All customers have been checked out.");
	}

}

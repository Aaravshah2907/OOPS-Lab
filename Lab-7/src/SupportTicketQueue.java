import java.util.*;

public class SupportTicketQueue {

	public static void main(String[] args) {
		// Step 1: Create a Queue to store support tickets
		Queue<String> supportQueue = new LinkedList<>();
		// Step 2: Add 3 more support tickets to the queue
		supportQueue.offer("Issue with login");
		supportQueue.offer("Payment not processed");
		supportQueue.offer("Refund not received");
		supportQueue.offer("Product not received");
		supportQueue.offer("Money Laundering");
		
		// Step 3: Process each ticket one by one
		for (String queue : supportQueue) {
			System.out.println("Poll (remove first element): " + queue);
		}
		supportQueue.clear();
		// Step 4: Check if the queue is empty
		System.out.println(supportQueue.poll());
	}

}

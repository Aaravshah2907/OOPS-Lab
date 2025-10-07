import java.util.*;

public class PriorityQueueMethodsExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// Adding elements
		pq.add(30);
		pq.offer(10);
		pq.offer(20);
		System.out.println("Priority Queue: " + pq); // Output: [10, 30, 20] (Heap order)
		
		// Peek and Poll
		System.out.println("Peek (Highest Priority): " + pq.peek()); // Output: 10
		System.out.println("Poll (Removing Highest Priority): " + pq.poll()); // Output: 10
		System.out.println("After Poll: " + pq); // Output: [20, 30]
		
		// Checking size and containment
		System.out.println("Size: " + pq.size()); // Output: 2
		System.out.println("Contains 20? " + pq.contains(20)); // Output: true
		
		// Convert to array
		Object[] arr = pq.toArray();
		System.out.println("Queue as Array: " + Arrays.toString(arr)); // Output: [20, 30]
		
		// Removing elements
		pq.remove(20);
		System.out.println("After Removing 20: " + pq); // Output: [30]
		
		// Clearing the queue
		pq.clear();
		System.out.println("Is Empty? " + pq.isEmpty()); // Output: true
	}
}

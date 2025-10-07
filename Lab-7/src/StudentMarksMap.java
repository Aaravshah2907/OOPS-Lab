import java.util.*;

public class StudentMarksMap {

	public static void main(String[] args) {
		// Step 1: Create a HashMap to store student names and marks
		Map<String, Integer> studentMarks = new HashMap<>();
		
		// Step 2: Add 3 more students and their marks
		studentMarks.put("Alice", 85);
		studentMarks.put("Bob", 78);
		
		// Step 3: Print all students and their marks
		System.out.println("Students-Marks Hash Map = "+studentMarks);
		
		// Step 4: Find and print Alice's marks
		System.out.println("Alice Marks = " + studentMarks.get("Alice"));
		
		// Step 5: Remove Bob from the map
		studentMarks.remove("Bob");
		
		// Step 6: Check if David exists in the map
		boolean CherryPresent = studentMarks.containsKey("Cherry");
		System.out.println("Cherry present : "+ CherryPresent);
		
		// Step 7: Display the total number of students
		System.out.println("Total Students post removal : "+ studentMarks.size());
	}

}

import java.util.*;
public class EmployeeSalaryMap {

	public static void main(String[] args) {
		// Step 1: Create a TreeMap to store employee names and salaries
		TreeMap<String, Integer> employeeSalaries = new TreeMap<>();
		//map entries 
		employeeSalaries.put("John", 50000); 
		employeeSalaries.put("Alice", 60000); 
		employeeSalaries.put("Bob", 55000); 
		employeeSalaries.put("David", 65000); 
		employeeSalaries.put("Eve", 70000); 
		
		// Step 2: Print all employees in sorted order 
		System.out.println("treeMap : " + employeeSalaries);
		
		// Step 3: Increase John's salary by 5000 
		employeeSalaries.put("John", employeeSalaries.get("John") + 5000);

		// Step 4: Find the employee with the highest and lowest salary  
		// Step 5: Check if "Michael" exists in the map; 
		// Step 6: Remove an employee (e.g., "Bob") 
	}

}

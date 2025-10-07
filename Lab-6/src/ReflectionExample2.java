package lab6_SC;

import java.lang.reflect.*;
class Employee {
private String name;
private double salary;
public Employee(String name, double salary) {
this.name = name;
this.salary = salary;
}
public void displayInfo() {
System.out.println("Employee Name: " + name + ", Salary: " + salary);
}
}
public class ReflectionExample2 {
public static void main(String[] args) {
try {
// Create an Employee object
Employee emp = new Employee("John", 50000);
emp.displayInfo();
// Obtain the Class object for the Employee class
Class<?> empClass = emp.getClass();
// Access the private field 'salary'
Field salaryField = empClass.getDeclaredField("salary");
// Set accessible to true to modify the private field
salaryField.setAccessible(true);
// Modify the 'salary' field
salaryField.set(emp, 75000);
// Display modified info
emp.displayInfo();
} catch (Exception e) {
e.printStackTrace();
}
}
}
import java.util.*;
public class TreeSetMethodsExample { 
    public static void main(String[] args) { 
        TreeSet<Integer> set = new TreeSet<>(); 
 
        // Adding elements 
        set.add(50); 
        set.add(20); 
        set.add(10); 
        set.add(40); 
        set.add(30); 
 
        System.out.println("TreeSet: " + set); 
 
        System.out.println("First Element: " + set.first());// Retrieving first and last elements 
        System.out.println("Last Element: " + set.last()); 
 
        System.out.println("Higher than 25: " + set.higher(25)); // Checking higher and  lower values 
        System.out.println("Lower than 25: " + set.lower(25)); 
 
        System.out.println("Poll First: " + set.pollFirst());// Polling elements 
        System.out.println("Poll Last: " + set.pollLast()); 
 
        System.out.println("HeadSet (less than 40): " + set.headSet(40)); // Subset  operations exclusive
        System.out.println("TailSet (greater than 20): " + set.tailSet(20)); // Inclusive
        System.out.println("SubSet (between 20 and 40): " + set.subSet(20, 40)); // smaller value : inclusive, larger : exclusive
    } 
}
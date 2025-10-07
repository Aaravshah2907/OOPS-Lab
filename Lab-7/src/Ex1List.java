import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
public class Ex1List {
	public static void main (String [] args) {
		ArrayList<Integer> a = new ArrayList<>();
		System.out.println("Org arraylist : " + a);
		a.add(1); a.add(100); a.add(1023); a.add(3);
		System.out.println("After adding:   " +a);
		LinkedList <Integer> l = new LinkedList<>(a);
		System.out.println("Org Linkedlist: " + l);
		l.addFirst(2);
		l.addLast(50);
		l.remove(1);
		System.out.println("After modifying: "+l);
		Collections.reverse(l);
		System.out.println("After reversing LL: "+ l);
		System.out.println("AL: "+ a);
		
	}
}

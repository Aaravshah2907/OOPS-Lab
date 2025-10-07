import java.util.Comparator;
import java.util.function.*;

@FunctionalInterface
interface MyComparator { 
    boolean compare(int a, int b); 
} 
 

public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComparator greaterThan = (a, b) -> a > b;
		System.out.println("3 greater than 4? : " + greaterThan.compare(3,4));
	}

}

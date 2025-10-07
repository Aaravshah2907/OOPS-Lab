import java.util.function.*;
import java.util.Arrays;
import java.util.List;

class LambdaPractice {
	public static void main(String[] args) {
		// 1. A lambda that prints "Hello World"
		Runnable greet = () -> System.out.println("Hello World");
		greet.run();
		
		// 2. A lambda that adds two integers
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println("5 + 3 = " + add.apply(5, 3));
		
		// 3. A lambda that checks if a number is even
		Predicate<Integer> isEven = (n) -> n % 2 == 0;
		System.out.println("Is 4 even? " + isEven.test(4));
		
		// 4. A lambda that returns the length of a string
		Function<String, Integer> stringLength = (s) -> s.length();
		System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));
		
		// 5. A lambda with no parameters returning a string
		Supplier<String> getMessage = () -> "do OOPs";
		System.out.println(getMessage.get());
		
		// 6. Sorting a list using a lambda
		List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
		names.sort(null);
		System.out.println("Sorted names: " + names);
	}
}
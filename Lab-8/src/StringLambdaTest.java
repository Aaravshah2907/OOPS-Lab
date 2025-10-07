interface StringOperation {
	String operate(String input);
}

public class StringLambdaTest {
	public static void main(String[] args) {
		// 1. Convert a string to Upper case
		StringOperation toUpperCase = (s) -> s.toUpperCase();
		System.out.println("Uppercase: " + toUpperCase.operate("hello"));
		
		// 2. Reverse a string
		StringOperation reverse = (s) -> new StringBuilder(s).reverse().toString();
		System.out.println("Reversed: " + reverse.operate("lambda"));
		
		// 3. Check if a string is a Palindrome (return "Yes" or "No")
		StringOperation isPalindrome = s -> {
			String s2 = reverse.operate(s);
			boolean pal = s2.equals(s);
			return (pal) ? "Yes" : "No";
		};
		System.out.println("Is 'radar' a palindrome? " + isPalindrome.operate("radar"));
		System.out.println("Is 'hello' a palindrome? " + isPalindrome.operate("hello"));
	}
}
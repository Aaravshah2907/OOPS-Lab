public class GenericsBasics {
	public static void main(String[] args) {
		// Box for String
		Box<String> stringBox = new Box<>();
		stringBox.set("Hello Generics");
		System.out.println("String value: " + stringBox.get());

		// Box for Integer
		Box<Integer> intBox = new Box<>();
		intBox.set(123);
		System.out.println("Integer value: " + intBox.get());
	}
}
public class VaragsExample {
	public static int sum(int... numbers) {
		int total = 0;
		for (int num : numbers) { 
			// 'numbers' is treated as an array
			total += num;
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(sum(10));

		System.out.println(sum(10, 20, 30));
	}
}
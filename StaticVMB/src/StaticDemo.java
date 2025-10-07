class MyStatic { 
	int a; // Initialized to zero 
	static int b; // Initialized to zero only when the class is loaded, not for each object  
	// Constructor incrementing static variable b 
	MyStatic() { 
		b++; 
	} 
	
	public void showData() { 
		System.out.println("Value of a = " + a); 
		System.out.println("Value of b = " + b); 
		} 
	// Uncommented method to demonstrate static behavior (optional) 
	
	public static void increment() { 
		// Cannot modify instance variable 'a' here because 'a' is not static 
		// Uncomment the below line to observe the compilation error: 
		// a++; 
		b++; // Valid, as 'b' is a static variable 
	} 
}

public class StaticDemo {
	
	static {
		System.out.println("Static block Initialised");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStatic s1 = new MyStatic();
		s1.showData();
		MyStatic s2 = new MyStatic();
		s2.showData();
		MyStatic.increment();
		MyStatic.b++;
		s1.showData();
	}

}

public class StaticExample2{ 
	static { 
		System.out.println("This is first static block"); 
	} 
	
	public StaticExample2(){ 
		System.out.println("This is constructor"); 
	} 
	
	public static String staticString = "Static Variable"; 
	
	static { 
		System.out.println("This is second static block and " + staticString); 
	} 
	
	public static void main(String[] args){ 
		StaticExample2 statEx = new StaticExample2(); 
		StaticExample2.staticMethod2(); 
		StaticExample2 statex2 = new StaticExample2();
		StaticExample2.staticMethod2();
	} 
	
	static { 
		staticMethod(); 
		System.out.println("This is third static block"); 
	}
	
	public static void staticMethod() { 
		System.out.println("This is static method"); 
	} 
	
	public static void staticMethod2() { 
		System.out.println("This is static method2"); 
	} 
} 
public class MyStaticClass {
    int a;
    static int b;

    // Constructor
    MyStaticClass() {
        b++;
    }

    public void showData() {
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }

    public static void incrementBehaviour(){
        // Cannot modify Instance variable a
        b++; // Can modify static variable b
    }
}

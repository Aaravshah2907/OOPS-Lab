package module01.today22082025;

class StaticDemo {
    public static int x;
    public int y;
    public static void compute() {
        System.out.println("Hello World" + x);
        //System.out.println("Hello World" + y);
    }
    public static void compute( int n) {
        System.out.println("Hello World"+n);
    }
    public void compute (String a) {
        System.out.println("Hello World" + x);
        System.out.println("Hello World" + y);
    }
}
public class StaticMethodOverloadDemo {
    public static void main(String[] args) {
        StaticDemo.compute();
        StaticDemo.compute(6);
        new StaticDemo().compute("Hello World");
    }

}

public class StaticExample {
    static int counter = 0;

    static {
        System.out.println("This is first static block");
        System.out.println("--Counter : " + counter++ + "--");
    }

    public StaticExample(){
        System.out.println("This is constructor");
        System.out.println("--Counter : " + counter++ + "--");
    }

    public static String staticString = "Static Variable";

    static {
        System.out.println("This is second static block and " + staticString);
        System.out.println("--Counter : " + counter++ + "--");
    }

    public static void main(String[] args){
        StaticExample statEx = new StaticExample();
        StaticExample.staticMethod2();
    }

    static {
        staticMethod();
        System.out.println("This is third static block");
        System.out.println("--Counter : " + counter++ + "--");
    }

    public static void staticMethod() {
        System.out.println("This is static method");
        System.out.println("--Counter : " + counter++ + "--");
    }

    public static void staticMethod2() {
        System.out.println("This is static method2");
        System.out.println("--Counter : " + counter++ + "--");
    }
}

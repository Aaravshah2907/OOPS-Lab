package module03.inheritance.interfaces;

public interface Beta extends Alpha {
    default public void reset() {
        System.out.println("Beta Interface");
        Alpha.super.reset();

    }
    static void compute() {
        System.out.println("Hello Static");
    }
}

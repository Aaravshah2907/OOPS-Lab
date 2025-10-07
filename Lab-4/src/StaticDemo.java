public class StaticDemo {
    static {
        System.out.println("Static block executed ------ #1");
    }

    public static void main(String[] args) {
        MyStaticClass static1 = new MyStaticClass();
        static1.showData();
        MyStaticClass static2 = new MyStaticClass();
        static2.showData();
        MyStaticClass.incrementBehaviour();
        static2.showData();
        MyStaticClass.b++;
        static1.showData();
        System.out.println("Main block executed ------ #2");
    }
}

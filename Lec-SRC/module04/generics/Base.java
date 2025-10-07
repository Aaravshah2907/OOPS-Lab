package module04.generics;

public class Base {
    Object get() { return null; }
    float get1() { return 1F; }

    public static void main( String args[]) {
        Base b1 = new Base();
        Derived d1 = new Derived();
        System.out.println(b1.get());
        System.out.println(d1.get());
    }
}

class Derived extends Base {
    @Override
    Integer get() { return null; }

    float get1() { return 1; }


}

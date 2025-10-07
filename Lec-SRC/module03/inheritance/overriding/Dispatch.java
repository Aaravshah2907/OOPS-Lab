package module03.inheritance.overriding;

class A7 {
    int i =6;
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B7 extends A7 {
    int i = 7;
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C7 extends A7 {
    int i = 8;
    int k = 10;
    void callme() {
        System.out.println("Inside C's callme method" + k);
        System.out.println(i);
    }
}

public class Dispatch {

    public static void main(String[] args) {
        A7 a = new A7();
        B7 b = new B7();
        C7 c = new C7();

        A7 r;

        r = a;
        r.callme();
        System.out.println(r.i);
        //Type casting from superclass reference
        System.out.println(((A7) r).i); // field from B7 → 7

        r = b;
        r.callme();
        System.out.println(r.i);
        System.out.println(((B7) r).i); // field from B7 → 7

        r = c;
        r.callme();
        System.out.println(r.i);
        System.out.println(((C7) r).i); // field from B7 → 7
    }
}
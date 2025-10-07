package module03.inheritance;

class A4 {
    static { System.out.println("Static Block A"); }
    { System.out.println("Instance Block A"); }
    A4() {
        System.out.println("Inside A's constructor.");
    }
}

class B4 extends A4 {
    static { System.out.println("Static Block B"); }
    { System.out.println("Instance Block B"); }
    B4() {
        System.out.println("Inside B's constructor.");
    }
}

class C4 extends B4 {
    static { System.out.println("Static Block C"); }
    { System.out.println("Instance Block C"); }
    C4() {
        System.out.println("Inside C's constructor.");
    }
}

public class CallingCons {

    public static void main(String[] args) {
        C4 c = new C4();
        c = new C4();
    }

}
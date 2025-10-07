package module03.nestedclass;

class Outer {
    int outer_x = 100;

    public class Inner {
        int y = 10;

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

    void test() {
        Inner inner = new Inner();
        inner.display();
    }



    void showy() {
        // System.out.println(y);
    }
}

public class InnerClassDemo {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
package module01.today22082025;

class OverloadDemo3 {
    void test() {
        System.out.println("No parameters");
    }

    // Overload test for two integer parameters.
    void test(int a, double b) {
        System.out.println("ID: a and b: " + a + " " + b);
    }

    void test(double a, int b) {
        System.out.println("DI: a and b: " + a + " " + b);
    }
    void test(double a, double b) {
        System.out.println("DD: a and b: " + a + " " + b);
    }

    // overload test for a double parameter and return type
    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}

class Overload3 {
    public static void main(String[] args) {
        OverloadDemo3 ob = new OverloadDemo3();
        int i = 88;

        ob.test();
        //ob.test(10, 20);

        ob.test(i); // this will invoke test(double)
        ob.test(123.2); // this will invoke test(double)
    }
}

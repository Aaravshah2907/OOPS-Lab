public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        System.out.println("Area of c1: " + c1.area());

        // Access static method using the class name
        Circle.getCircumference(2.3);
        Circle c2 = new Circle(3.45);
        System.out.println("Area of c2: " + c2.area());

        // Accessing static method using an object reference (discouraged)
        c2.getCircumference(3.45);

        // Experiment with static method and observe behavior
        /*
        1. Make the area() function static and observe the behavior.
        2. Remove the formal argument from getCircumference() and observe the results.
        3. Replace the static keyword with final in the getCircumference() method and fix
        any errors.
        */
    }
}

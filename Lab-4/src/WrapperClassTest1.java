public class WrapperClassTest1 {
    public static void main(String[] args) {
        Integer I = new Integer(10); // Create an Integer object
        Integer J = new Integer(20); // Create another Integer object

        // Explicitly get the primitive int value
        System.out.println(I.intValue()); // Output: 10
        System.out.println(I); // Output: 10 (implicitly calls toString())
        System.out.println(J.intValue()); // Output: 20
        System.out.println(J); // Output: 20

        // Add primitive values explicitly
        Integer K1 = new Integer(I.intValue() + J.intValue());
        System.out.println(K1); // Output: 30

        // Automatic unboxing (Java rewrites this to use intValue() internally)
        Integer K2 = I + J + K1;
        System.out.println(K2); // Output: 60
    }
}

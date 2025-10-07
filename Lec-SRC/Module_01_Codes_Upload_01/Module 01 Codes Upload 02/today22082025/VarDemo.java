package module01.today22082025;

/**

 *
 * A simple demonstration of local variable type inference.
 */
public class VarDemo {

    public static void main(String[] args) {

        var avg = 10.0;
        System.out.println("Value of avg: " + avg);

        int var = 1;
        System.out.println("Value of var: " + var);

        var k = -var;
        System.out.println("Value of k: " + k);

        var myArray = new int[10]; // This is valid
        //var[] myArray = new int[10]; // Wrong
        //var myArray[] = new int[10]; // Wrong
        //var counter; // Wrong! Initializer required.
        // var myArray = { 1, 2, 3 }; // Wrong
    }
}


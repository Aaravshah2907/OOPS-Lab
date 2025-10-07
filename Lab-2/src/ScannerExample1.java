import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        int num1;
        double double1;
        String numStr1, numStr2;
        /*
         * instantiate scanner class by passing System.in to its constructor
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num1 = in.nextInt(); // reads an int from keyboard
        System.out.println("You entered: " + num1);
        System.out.println("Enter a double: ");
        double1 = in.nextDouble();// reads a double from keyboard
        System.out.println("You entered: " + double1);
        System.out.println("Enter your first name ");
        numStr1 = in.next(); // reads string from keyboard
        System.out.println("Your name is " + numStr1);
        System.out.println("Enter your surname: ");
        numStr2 = in.next();
        System.out.println("Your surname is " + numStr2);
        in.close(); // always remember to free the resources by closing scanner
    }
}

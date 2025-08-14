public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The first " + n + " Fibonacci numbers are : \n");
        int a = 1;
        int b = 1;
        double sum = 2.0;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
            sum += temp;
        }
        System.out.println();
        System.out.println("Average of above numbers is : " + sum/n);
    }
}

package module03.lambdas;

interface NumericFunc1 {
    void func(int n);
}

public class BlockLambdaDemo3 {

    public static void main(String[] args) {
        NumericFunc1 factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;

            System.out.println(result);
        };

        System.out.println("The factoral of 3 is ");
        factorial.func(3);
        //System.out.println("The factoral of 5 is " + factorial.func(5));
    }
}

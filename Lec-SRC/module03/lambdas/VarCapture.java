package module03.lambdas;

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    int zx =67;

    public static void main(String[] args) {
          int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;

             //num++;

            return v;
        };
        System.out.println(myLambda.func(67));
        //num++;

        // num = 9;
    }
}

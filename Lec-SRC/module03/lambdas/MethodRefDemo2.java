package module03.lambdas;

/**
 * C15 L11
 *
 * Demonstrate a method reference to an instance method
 */
interface StringFunc45 {
    String func(String n);
}

class MyStringOps2 {
    String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}

class MethodRefDemo2 {
    static String stringOp(StringFunc45 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        MyStringOps2 strOps = new MyStringOps2();

        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
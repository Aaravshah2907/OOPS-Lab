package module04.generics;

class GenMethDemo {

    // Determine if an object is in an array.
    /*
    T extends Comparable<T>.
    Comparable is an interface declared in java.lang.
    A class that implements Comparable defines objects that can be
    ordered. Thus, requiring an upper bound of Comparable
    ensures that isIn( ) can be used only with objects that are
    capable of being compared. Comparable is generic,
    and its type parameter specifies the type of objects
    that it compares.
     */
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {

        for(int i=0; i < y.length; i++)
            if(x.equals(y[i])) return true;

        return false;
    }

    public static void main(String args[]) {

        // Use isIn() on Integers.
        Integer nums[] = { 1, 2, 3, 4, 5 };
        /*
        the type of the first argument is Integer (due to autoboxing),
        which causes Integer to be substituted for T.
        The base type of the second argument is also Integer,
        which makes Integer a substitute for V, too.
         */
        if(isIn(2, nums))
            System.out.println("2 is in nums");
        /*
        Although type inference will be sufficient for most
        generic method calls, you can explicitly specify
        the type argument if needed.
         */
        GenMethDemo.<Integer, Integer>isIn(2, nums);
        if(!isIn(7, nums))
            System.out.println("7 is not in nums");

        System.out.println();

        // Use isIn() on Strings.
        String strs[] = { "one", "two", "three",
                "four", "five" };

        if(isIn("two", strs))
            System.out.println("two is in strs");

        if(!isIn("seven", strs))
            System.out.println("seven is not in strs");

        // Opps! Won't compile! Types must be compatible.
//    if(isIn("two", nums))
//      System.out.println("two is in strs");
    }
}

// <type-param-list > ret-type meth-name (param-list) { // …

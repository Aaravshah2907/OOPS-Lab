package module04.generics;

// Generics and arrays.
class Gen300<T extends Number> {
    T ob;

    T vals[]; // OK

    Gen300(T o, T[] nums) {
        ob = o;

        // This statement is illegal.
        // vals = new T[10]; // can't create an array of T
        // there is no way for the
        //compiler to know what type of array to actually create.
        // But, this statement is OK.
        vals = nums; // OK to assign reference to existent array
    }
}

class GenArrays {
    public static void main(String args[]) {
        Integer n[] = { 1, 2, 3, 4, 5 };
        Float f[] = { 1F, 2F, 3F, 4F, 5F };
        String s[] = { "1F, 2F, 3F, 4F, 5F" };

        Gen300<Integer> iOb = new Gen300<Integer>(50, n);

        // Can't create an array of type-specific generic references.
        // Gen<Integer> gens[] = new Gen<Integer>[10]; // Wrong!

        // This is OK.
        //can create an array of references to a generic type if by a wildcard
        Gen300<?> gens[] = new Gen300<?>[10]; // OK
        gens[0] = new Gen300<Integer>(50, n);
        gens[1] = new Gen300<Float>(50F, f);
        //gens[2] = new Gen300<String>(50F, s);
    }
}


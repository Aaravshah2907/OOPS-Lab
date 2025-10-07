package module04.generics;

// Overriding a generic method in a generic class.
class Gen91<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen91(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        System.out.print("Gen's getob(): " );
        return ob;
    }
}

// A subclass of Gen that overrides getob().
class Gen92<T> extends Gen91<T> {

    Gen92(T o) {
        super(o);
    }

    // Override getob().
    T getob() {
        System.out.print("Gen2's getob(): ");
        super.getob();
        return ob;
    }
}

// Demonstrate generic method override.
class OverrideDemo {
    public static void main(String args[]) {

        // Create a Gen object for Integers.
        Gen91<Integer> iOb = new Gen91<Integer>(88);

        // Create a Gen2 object for Integers.
        Gen92<Integer> iOb2 = new Gen92<Integer>(99);

        // Create a Gen2 object for Strings.
        Gen92<String> strOb2 = new Gen92<String>("Generics Test");

        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
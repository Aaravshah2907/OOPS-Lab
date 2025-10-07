package module04.generics;

class Gen5<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen5(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}
class RawDemo {
    public static void main(String args[]) {

        // Create a Gen object for Integers.
        Gen5<Integer> iOb = new Gen5<Integer>(88);
        System.out.println("value: " + iOb.getob());

        // Create a Gen object for Strings.
        Gen5<String> strOb = new Gen5<String>("Generics Test");
        System.out.println("value: " + strOb.getob());

        // Create a raw-type Gen object and give it
        // a Double value.
        //that no type arguments are specified.
        // this creates a Gen
        //object whose type T is replaced by Object.
        Gen5 raw = new Gen5(new Double(98.6));

        // Cast here is necessary because type is unknown.
        double d = (Double) raw.getob();
        System.out.println("value: " + d);

        // The use of a raw type can lead to run-time.
        // exceptions.  Here are some examples.

        // The following cast causes a run-time error!
         int i = (Integer) raw.getob(); // run-time error
        /*A raw type is not type safe.
        Thus, a variable of a raw type can be assigned a
        reference to any type of Gen object.
        The reverse is also allowed; a variable of a
        specific Gen type can be assigned a reference to a raw Gen object.
         */

        // This assigment overrides type safety.
        strOb = raw; // OK, but potentially wrong
        //    String str = strOb.getob(); // run-time error

        // This assingment also overrides type safety.
        raw = iOb; // OK, but potentially wrong
        //d = (Double) raw.getob(); // run-time error
    }
}


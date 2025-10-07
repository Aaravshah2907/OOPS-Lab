package module04.generics;

// A nongeneric class can be the superclass
// of a generic subclass.

// A nongeneric class.
class NonGen2 {
    int num;

    NonGen2(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}

// A generic subclass.
class Gen3<T> extends NonGen2 {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen3(T o, int i) {
        super(i);
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

class Gen4<T> extends Gen3<T> {

    Gen4(T o, int i) {
        super(o, i);
    }
}
// Create a Gen object.
class HierDemo2 {
    public static void main(String args[]) {

        // Create a Gen object for String.
        Gen3<String> w = new Gen3<String>("Hello", 47);

        System.out.print(w.getob() + " ");
        System.out.println(w.getnum());
    }
}

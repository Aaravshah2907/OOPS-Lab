package module04.generics;

// Ambiguity caused by erasure on
// overloaded methods.
class MyGenClass<T, V> {
    T ob1;
    V ob2;

    // ...

    // These two overloaded methods are ambiguous
    // and will not compile.
    /*void set(T o) {
        ob1 = o;
    }*/

    void set(V o) {
        ob2 = o;
    }
}
public class AmbiguityErrors {

    MyGenClass<String, String> obj = new MyGenClass<String, String>
            ();

    /*
    class MyGenClass<T, V extends Number> {
    MyGenClass<String, Number> x = new MyGenClass<String, Number>();
    MyGenClass<Number, Number> x = new MyGenClass<Number, Number>(); //Ambiguity returns
     */
}

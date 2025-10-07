package module04.generics;

public class Errors {
    /*
    // Can't create an instance of T.
    class Gen<T> {
        T ob;
        Gen() {
            ob = new T(); // Illegal!!!
        }
    } The compiler does not know what type of object to create.
    T is simply a placeholder.

    class Wrong<T> {
        // Wrong, no static variables of type T.
        static T ob;

         // Wrong, no static method can use T.
        static T getob() {
          return ob;
         }
    }
    can’t declare static members that use a type parameter
declared by the enclosing class,
can declare static generic methods, which define their own type parameters
     */
}

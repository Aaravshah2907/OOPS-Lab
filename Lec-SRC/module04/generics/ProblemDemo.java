package module04.generics;

import java.util.ArrayList;
import java.util.List;

public class ProblemDemo {

    public static void main(String args[]){
        List stringList = new ArrayList();
        // No compile-time errors but most IDEs will warn
        // that the List initialized is of a raw type and
        // should be parameterized with a generic.
        stringList.add("Apple");
        // We can add any Object type
        stringList.add(1);
        // Adding two or more different types within the same collection
        // violates the rules of type safety.

        // The main issue:
        //for (String string : stringList) {
       //     System.out.println(string);
        //}
        // isn't a real fix.
        // This is just avoiding the underlying design problem
        // in an unsustainable way.
        for (Object obj : stringList) {
            System.out.println(obj);
        }
        /*
        In OOP, explicit casting should be avoided as much as possible
        because it isn't a reliable solution for OOP-related problems.
        The List class is a subtype of Collection, it should have access to
        iterators using the Iterator object, the iterator() method,
        and for-each loops.
        If a collection is declared without generics,
        then we cannot use any of these iterators, in a reasonable manner.
         */
    }
}

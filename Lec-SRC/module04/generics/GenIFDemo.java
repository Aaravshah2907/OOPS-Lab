package module04.generics;

// A generic interface example.

// A Min/Max interface.
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// Now, implement MinMax
/*
Pay special attention to the way that the type parameter T is declared by
MyClass and then passed to MinMax.
Because MinMax requires a type that implements Comparable,
the implementing class (MyClass in this case) must specify the same bound.
Furthermore, once this bound has been established, there is no need
to specify it again in the implements clause. In fact, it would
be wrong to do so and won’t compile
class MyClass<T extends Comparable<T>> implements MinMax<T extends Comparable<T>> { -- wrong
class MyClass implements MinMax<T> { // Wrong!

Because MyClass does not declare a type parameter, there is no way to pass
one to MinMax.
In this case, the identifier T is simply unknown, and the
compiler reports an error.
Of course, if a class implements a specific type of generic interface,
such as:
class MyClass implements MinMax<Integer> { // OK
then the implementing class does not need to be generic.
 */
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) { vals = o; }

    // Return the minimum value in vals.
    public T min() {
        T v = vals[0];

        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) < 0) v = vals[i];

        return v;
    }

    // Return the maximum value in vals.
    public T max() {
        T v = vals[0];

        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) > 0) v = vals[i];

        return v;
    }
}

class GenIFDemo {
    public static void main(String args[]) {
        Integer inums[] = {3, 6, 2, 8, 6 };
        Character chs[] = {'b', 'r', 'p', 'w' };

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());

        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());
    }
}
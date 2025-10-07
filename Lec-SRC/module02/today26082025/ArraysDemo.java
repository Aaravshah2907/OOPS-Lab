package module02.today26082025;

import java.util.Date;

class Person{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
public class ArraysDemo {

    public static void main (String args[]) {

        var doubleArray = new double[10];
        boolean [] boolArray = new boolean[5];
        char [] charArray = new char[5];
        String [] stringArray = new String[7];
        Date[] dateArray = new Date[10];
        Person[] person = new Person[10];

        for(double i:doubleArray ) {
            System.out.println(i);
        }
        for(boolean i:boolArray ) {
            System.out.println(i);
        }
        for(char ch:charArray ) {
            System.out.println(ch);
        }
        for(String i:stringArray ) {
            System.out.println(i);
        }
        for(Date dt:dateArray ) {
            System.out.println(dt);
        }
        System.out.println(dateArray[3]);

        for(Person per:person ) {
            System.out.println(per);
        }
        System.out.println(boolArray[3]);
        System.out.println(charArray[3]);
        System.out.println(stringArray[3]);
        System.out.println(Integer.parseInt(String.valueOf((int)doubleArray[3])));
        System.out.println(stringArray[3]);
        //System.out.println(dateArray[3].toString());
        System.out.println(person[3].getName());
        person[3] = new Person();
        System.out.println(person[3].toString());
    }
}

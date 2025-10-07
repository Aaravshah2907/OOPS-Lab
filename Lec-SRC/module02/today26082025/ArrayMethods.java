package module02.today26082025;

import java.util.Arrays;

public class ArrayMethods {

    public static void main (String args[]) {

        double [] doubleArray1 = new double[10];
        double [] doubleArray2 = new double[10];
        for (int i =0; i< doubleArray1.length ; i++) {
            doubleArray1[i] = doubleArray1.length-i;
        }
        Arrays.fill(doubleArray2, Math.random());
        System.out.println(doubleArray1);
        for ( double i: doubleArray1) {
            System.out.println(i);
        }
        for ( double i: doubleArray2) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(doubleArray1));
        Arrays.sort(doubleArray1);
        System.out.println(Arrays.toString(doubleArray1));
        System.out.println(Arrays.binarySearch(doubleArray1,11));
        System.out.println(Arrays.binarySearch(doubleArray1,10));
        System.out.println(Arrays.binarySearch(doubleArray1,110));
        System.out.println(Arrays.equals(doubleArray1, doubleArray2));
    }
}

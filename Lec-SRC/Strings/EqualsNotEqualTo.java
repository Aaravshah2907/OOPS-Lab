package module02.today29082025;

public class EqualsNotEqualTo {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        String s3 = "Hello";

        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s3));
    }
}
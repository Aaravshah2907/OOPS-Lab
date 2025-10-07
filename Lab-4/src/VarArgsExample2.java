public class VarArgsExample2 {
    public static String joinStrings(String separator, String... strings) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            result.append(strings[i]);
            if (i < strings.length - 1) {
                result.append(separator);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(joinStrings(", ", "apple", "banana", "cherry")); // Output: apple, banana, cherry
        System.out.println(joinStrings(" - ", "Java", "Python", "C++")); // Output: Java - Python - C++
    }
}

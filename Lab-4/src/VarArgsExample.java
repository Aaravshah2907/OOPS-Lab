public class VarArgsExample {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            System.out.print(i+ " + ");
            sum += i;
        }
        System.out.print("0 = ");
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(sum());
        System.out.println(sum(1,2,3));
        System.out.println(sum(100,125,123,2,13,123,1,3,123,123));
    }
}

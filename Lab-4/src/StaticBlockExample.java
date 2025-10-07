public class StaticBlockExample {

    static int[] values = initializeArray(10); // Initialize array using private static method

    private static int[] initializeArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // Populate array with sequential values
        }
        return arr;
    }

    void listValues() {
        for (int value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        StaticBlockExample example = new StaticBlockExample();
        System.out.println("\nFirst object:");
        example.listValues();
        example = new StaticBlockExample();
        System.out.println("\nSecond object:");
        example.listValues();
    }
}

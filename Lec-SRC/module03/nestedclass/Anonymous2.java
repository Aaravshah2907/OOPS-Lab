package module03.nestedclass;

// Main class
public class Anonymous2 {

    private int z = 90;
    public void compute() {
        System.out.println("Hello");
        System.out.println(z);
    }

    // Main driver method
    public static void main(String[] args)
    {
        //Anonymous Class
        Anonymous2 obj = new Anonymous2() {

            public void compute()
            {
                System.out.println("Overridden Hello");
                super.compute();
                //System.out.print("Age is " + z); // z is private: not inherited
            }
        };
        obj.compute();

    }
}
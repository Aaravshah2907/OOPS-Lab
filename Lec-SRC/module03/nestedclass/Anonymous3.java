package module03.nestedclass;

// Main class
public class Anonymous3 {

    private int z = 90;
    public void compute() {
        //Anonymous Class
        Country2 obj = new Country2() {

            public void getAge()
            {
                System.out.println("Overridden Hello");
                super.getAge();
                System.out.print("Age is " + z);
                //System.out.print("Age is " + x); // x is private: not inherited
            }
        };
        obj.getAge();
    }

    // Main driver method
    public static void main(String[] args)
    {
        new Anonymous3().compute();

    }
}
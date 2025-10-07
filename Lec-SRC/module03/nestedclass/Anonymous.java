package module03.nestedclass;

class Country {
    private int z = 90;
    public void compute() {
        System.out.println("Hello");
        System.out.println(z);
    }
}
class Country2 {
    private int x = 21;
    //Anonymous Inner Class
    Country obj = new Country() {
        public void compute() {
            System.out.println("Hello 2");
            //System.out.println(z);
            System.out.println(x);
            super.compute();
        }
    };

    void getAge(){
        obj.compute();
        new Country().compute();
        System.out.println("no age");
    }
}



// Main class
public class Anonymous {

    // Main driver method
    public static void main(String[] args)
    {
        //Anonymous Class
        Country2 sobj = new Country2() {

            public void getAge()
            {
                super.getAge();
                //System.out.print("Age is " + x); // x is private: not inherited
            }
        };

        sobj.getAge();


    }
}
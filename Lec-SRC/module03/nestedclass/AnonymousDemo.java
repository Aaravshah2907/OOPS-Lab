package module03.nestedclass;

interface Age1 {
    int x = 21;
    void getAge();
}

// Main class
class AnonymousDemo {

    // Main driver method
    public static void main(String[] args)
    {

        Age1 oj1 = new Age1() {

            public void getAge()
            {
                // printing  age
                System.out.print("Age is " + x);
            }
        };

        oj1.getAge();


    }
}
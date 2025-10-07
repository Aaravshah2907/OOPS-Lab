package module01.today19082025;

class BoxCons1 {
    double width;
    double height;
    double depth;

    // construct clone of an object
    BoxCons1(BoxCons1 ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    BoxCons1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    BoxCons1() {
        width = -1;  // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1;  // box
    }

    // constructor used when cube is created
    BoxCons1(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        // create boxes using the various constructors
        BoxCons1 mybox1 = new BoxCons1(10, 20, 15);
        BoxCons1 mybox2 = new BoxCons1();
        BoxCons1 mycube = new BoxCons1(7);

        BoxCons1 myclone = new BoxCons1(mybox1);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of cube is " + vol);

        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
    }
}
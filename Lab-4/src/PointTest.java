public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        System.out.println("Before stat changes : " + p1);
        Point.changeState(p1);
        System.out.println("After stat changes : " + p1);

        // Pass by value
        Point p2 = new Point(100,200);
        System.out.println("Before stat changes : " + p2);
        Point.changeReference(p2);
        System.out.println("After stat changes : " + p2);
    }
}

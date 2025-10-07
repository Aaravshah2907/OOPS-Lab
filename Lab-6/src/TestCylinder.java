
package lab6_SC;

public class TestCylinder {
public static void main(String[] args) {
 cylinder cy1 = new cylinder(); // Use constructor 1
 System.out.println("Radius is " + cy1.getRadius() + " \n"
 + " Height is " + cy1.getHeight()  + " \n"
 + " Color is " + cy1.getColor()  + " \n"
 + " Base area is " + cy1.getArea()  + " \n"
 + " Volume is " + cy1.getVolume());
 cylinder cy2 = new cylinder(5.0, 2.0); // Use constructor 2
 System.out.println("Radius is " + cy2.getRadius()
 + " Height is " + cy2.getHeight()
 + " Color is " + cy2.getColor()
 + " Base area is " + cy2.getArea()
 + " Volume is " + cy2.getVolume());
 }
}

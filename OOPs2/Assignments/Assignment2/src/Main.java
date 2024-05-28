/*
    Create a set of classes to meet the following requirements:

    a. Class Point
        It should have 2 data-members: x and y.
        Add a constructor with two parameters: x and y.
        Add a copy constructor.

    b. Class Rectangle
        It should have 2 data-members:
            topLeft (Point)
            bottomRight (Point)
        Add a constructor with 4 parameters of type int: topLeftX, topLeftY, bottomRightX, bottomRightY.
        Add a constructor with 2 parameters of type Point: topLeft, bottomRight.
        Add a constructor with 1 parameter of type Rectangle.
    Make sure that Rectangle constructors make deep copies.
 */

class Main{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(1, 2, 2, 1);
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 1);
        Rectangle r2 = new Rectangle(p1, p2);

        Rectangle r3 = new Rectangle(r2);
        System.out.println(r1+"\n"+r2.topLeft+"\n"+r3.topLeft);
    }
    /*
    Rectangle@7364985f
    Rectangle@5d20e46
    Rectangle@709ba3fb
        r2 and r3 have different memory locations.
    Rectangle@7ff2a664
    Point@525b461a
    Point@58c1c010

     */
}
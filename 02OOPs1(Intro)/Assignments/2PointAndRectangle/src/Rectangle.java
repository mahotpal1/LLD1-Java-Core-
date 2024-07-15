/*
    Create a class Rectangle. It should have 3 data-members

        topLeft:Point
        height:int
        width:int
    It should have 3 methods

    getArea: It should return area of rectangle as an integer
    getPerimeter: It should return perimeter of rectangle as an integer
    getBottomRight: It should return a Point to represent the bottom right of the Rectangle.
 */

public class Rectangle{
    Point topLeft;
    public int height;
    public int width;

    public int getArea(){
        return this.width*this.height;
    }

    public int getPerimeter(){
        return 2*(this.height+this.width);
    }

    public Point getBottomRight(){
        Point p = new Point();
        p.x = this.topLeft.x + this.width;
        p.y = this.topLeft.y - this.height;

        return p;
    }
}
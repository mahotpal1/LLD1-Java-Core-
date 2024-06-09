
public class Rectangle{
    public Point topLeft;
    public Point bottomRight;

    public Rectangle(int topLeftx, int topLefty, int topRightx, int topRighty){
        topLeft = new Point(topLeftx, topLefty);
        bottomRight = new Point(topRightx, topRighty);
    }

    public Rectangle(Point topleft, Point bottomright){
        topLeft = new Point(topleft);
        bottomRight = new Point(bottomright);
    }

    public Rectangle(Rectangle r){
        topLeft = new Point(r.topLeft.x, r.topLeft.y);
        bottomRight = new Point(r.bottomRight.x, r.bottomRight.y);
    }
}
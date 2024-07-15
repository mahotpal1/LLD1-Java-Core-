/*
    Controller
 */

class Main{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.height = 12;
        r.width = 5;

        Point p = new Point();
        r.topLeft = p;
        r.topLeft.x = 2;
        r.topLeft.y = 3;

        System.out.println("Area of Rectangle = "+r.getArea());
        System.out.println("Perimeter of Rectangle = "+r.getPerimeter());
        System.out.println("Bottom right co-ordinate is "+r.getBottomRight().x+", "+r.getBottomRight().y);
    }
}
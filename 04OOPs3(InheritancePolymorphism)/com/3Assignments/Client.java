public class Client{
    public static void main(String[] args){
        ThreadPoint t1 = new ThreadPoint(1, 2, 3);
        Point p1 = new Point(1, 2);

        t1.display();
        p1.display();
    }
}
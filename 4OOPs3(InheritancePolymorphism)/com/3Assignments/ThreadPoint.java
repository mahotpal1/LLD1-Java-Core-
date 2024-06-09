
public class ThreadPoint extends Point{
    private int z;

    public ThreadPoint(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    @Override
    public void display(){
        System.out.println(x + ", " + y + ", " + z);
    }
}
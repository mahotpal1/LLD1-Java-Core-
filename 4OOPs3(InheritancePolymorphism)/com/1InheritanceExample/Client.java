public class Main{
    public static void main(String[] args){
        MountainBike m_object = new MountainBike(0, 2, 10, 1);
        Bicycle b_object = new Bicycle(0, 10, 2);
        m_object.printDetails();
        m_object.staticMethod();
        b_object.staticMethod();
        return;
    }
}
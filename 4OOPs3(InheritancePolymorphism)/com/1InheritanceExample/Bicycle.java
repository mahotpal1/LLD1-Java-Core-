public class Bicycle{
    protected int cadence;
    protected int gear;
    protected int speed;

    public Bicycle(int _cad, int _gear, int _speed){
        cadence = _cad;
        gear = _gear;
        speed = _speed;
    }

    protected void printDetails(){
        System.out.println("Cadence (Break Applied) : " + cadence);
        System.out.println("Gear: " + gear);
        System.out.println("Speed: " + speed);

    }

    public static void staticMethod() {
        System.out.println("Static method in Parent class");
    }

}
public class MountainBike extends Bicycle{
    // Let's declare new field that is not in parent
    public int seatHight;

    // defining same field as of parent (illegal).
    // public int startCadence;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear){
        // As parent has one parameterized constructor we need to call super for constructor chaining. Else chain will
        // be broken.
        super(startCadence, startGear, startSpeed);
        seatHight = startHeight;
    }

    // Overridding Method from parent class.
    @Override
    public void printDetails(){
        System.out.println("Mountain Bike Details!");
        // Inherited Field can be used directly just like seatHeight
        System.out.println("Cadence (Break applied): " + cadence);
        System.out.println("Gear: " + gear);
        System.out.println("Speed: " + speed);
        System.out.println("Height: " + seatHight);
    }

    // Hiding the Parent static Method
    public static void staticMethod() {
        System.out.println("Static method in Child class");
    }

}
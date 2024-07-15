/*
    MountainBike is a type of Bicycle that extends Vehicle Feature
 */

public class MountainBike extends Bicycle{
    // Temporary Controller
    public static void main(String[] args){
        MountainBike m = new MountainBike(12, 4, 2, 6);
        m.setSeatHeight(14);
        // setSeatHeight((12)); -> will throw the error as static main methopd trying to access non static member.
    }

    // Additional properties of MountainBike
    public int seatHeight;

    // Constructor For MountainBike
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startGear, startSpeed);
        seatHeight = startHeight;
    }

    // Funxtionalities of Mountain Bike
    public void setSeatHeight(int newValue){
        seatHeight = newValue;
    }
}


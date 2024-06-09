/*
    Created a class Bicycle with multiple features.
 */

public class Bicycle{
    // Adding Three Properties
    public int cadence;
    public int gear;
    public int speed;

    private int id;
    // static variable : Will be shared with all instance of this class, and refers to the unique memory location
    private static int numberOfBicycles;

    // Initializing the static field, at first executes once.
    static{
        System.out.println("Initializing Number of Vehicles!!");
        numberOfBicycles = 0;
    }

    // Constructor For Bicycle Class
    public Bicycle(int startCadence, int startGear, int startSpeed){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycle and assign ID number
        id = ++numberOfBicycles;
    }

    // Different Functionalities of Bicycle Class
    // Set Cadence
    public void setCadence(int cadence_value){
        cadence = cadence_value;
    }
    // Set Gear
    public void setGear(int gear_value){
        gear = gear_value;
    }
    // Apply Break
    public void applyBreak(int decrement){
        speed -= decrement;
    }
    // Speed Up
    public void speedUp(int decrement, int increment){
        speed += increment;
    }
    // new method to return the ID instance variable
    public int getID() {
        return id;
    }
}
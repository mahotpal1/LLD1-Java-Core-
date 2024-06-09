
public class Main{
    public static void main(String[] args) {
        Parent p = new Parent("Vishal", 26);
        Child c = new Child("Vishal", 16, 3, "Damru");

        p.printDetails();
        c.printDetails();
        c.printDetails("Happy");
    }
}
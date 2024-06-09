public class Client{
    public static void main(String[] args){

        Child c1 = new Child("Vishal", "Damru");
        Child c2 = new Child("Vishal", "Bamru");
        Child c3 = new Child("Vishal", "Gamru");

        //c3.printDetails();

        Child c4 = new Child("Harsh", "Dadru");

        Parent p1 = new Parent("Vishal");
        p1.printDetails();
        System.out.println(p1.getChildCount());

        Parent p2 = new Parent("Harsh");
        p2.printDetails();
        System.out.println(p2.getChildCount());
        return;
    }
}
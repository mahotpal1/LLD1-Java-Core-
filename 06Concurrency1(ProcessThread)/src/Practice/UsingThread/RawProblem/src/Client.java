public class Client {
    public static void main(String[] args) {
        System.out.println("I'm the main method!!");
        Thread t1 = new Thread(new Adder());
        t1.start();
        Thread t2 = new Thread(new Subtractor());
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println("Exception Caught : " + e);
        }
    }
}

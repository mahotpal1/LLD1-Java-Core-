/*
    Create a program to print alternate name passed in a class object,
    using two threads.
 */

class Client{
    public static void main(String[] args){
        // iN THIS EXAMPLE ORDER OF EXECUTION IS NOT GUArenteed!!
        Server s1 = new Server("Vishal");
        Thread t1 = new Thread(s1);
        t1.start();
        // If we add below join statement then after completion of first thread
        // second thread starts executing.

        /*
        try {
            t1.join();
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
        */

        Server s2 = new Server("Harsh");
        Thread t2 = new Thread(s2);
        t2.start();
    }
}
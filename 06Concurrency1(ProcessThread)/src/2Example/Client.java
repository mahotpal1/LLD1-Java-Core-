/*
Write code to achieve the following
A class Client with main method that prints: I am the main class
Client class should create a new thread and invoke code in a class called Adder.
The Adder class should print: I am the Adder class
Client class should create a new thread and invoke code in a class called Subtractor.
The Subtractor class should print: I am the Subtractor class
 */

class Client{
    public static void main(String[] args) {
        Adder a1 = new Adder();
        Thread t1 = new Thread(a1);
        t1.start();

        Substractor s1 = new Substractor();
        Thread t2 = new Thread(s1);
        t2.start();
        return;
    }
}
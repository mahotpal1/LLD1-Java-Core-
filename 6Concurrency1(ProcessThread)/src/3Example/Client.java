class Client{
    public static void main(String[] args) throws InterruptedException{
        long patience = 1000*5; // (set default patience to 1 hr)

        System.out.println("Starting thread!!");
        long startTime = System.currentTimeMillis();
        MessageLoop m1 = new MessageLoop();
        Thread t = new Thread(m1);
        t.start();
        System.out.println("Waiting for thread to finish!!!");
        while (t.isAlive()) {
            System.out.println("Still waiting...");
            // Wait maximum of 1 second
            // for MessageLoop thread
            // to finish.
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience)
                    && t.isAlive()) {
                System.out.println("Tired of waiting!");
                t.interrupt();
                // Shouldn't be long now
                // -- wait indefinitely
                t.join();
            }
        }
        System.out.println("Finally Printing!!");
    }
}
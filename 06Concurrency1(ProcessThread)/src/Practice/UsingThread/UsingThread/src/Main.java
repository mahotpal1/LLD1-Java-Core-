public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new UniqueStudent());
        t1.start();  // Start t1 (it begins executing run method)

        Thread t2 = new Thread(new UniqueStudent());
        t2.start();  // Start t2 (it begins executing run method)

        try {
            t1.join();  // Wait for t1 to finish
            t2.join();  // Wait for t2 to finish
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
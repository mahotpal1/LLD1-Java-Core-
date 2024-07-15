public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(Student.getInstance("Vishal", 26));
        t1.start();
    }
}
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client{
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();

        for(int i=1; i<=1000; i++){
            PrintNumber num = new PrintNumber(i);
            ex.submit(num);
        }
    }
}
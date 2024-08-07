import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MaintainCount count = new MaintainCount();
        ExecutorService ex = Executors.newCachedThreadPool();

        Future<Void> future1 = ex.submit(new Adder(count));
        Future<Void> future2 = ex.submit(new Substractor(count));

        future1.get();
        future2.get();

        System.out.println(count.value);

        ex.shutdown();
    }
}
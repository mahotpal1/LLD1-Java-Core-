
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 4, 6, 7, 2, 3, 32, 22, 3));

        Sorter sortMyList = new Sorter(list, executor);

        Future<List<Integer>> res = executor.submit(sortMyList);

        list = res.get();

        System.out.println(list);

        return;
    }
}

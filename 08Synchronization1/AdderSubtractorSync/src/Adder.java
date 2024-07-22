import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Count count;
    private Lock lock;
    public Adder(Count count, Lock lock){
        this.lock = lock;
        this.count = count;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1 ; i <= 10000 ; i++){
            lock.lock();
            // synchronised(count){
            count.value += i;
            // }
            lock.unlock();
        }
        return null;
    }
}
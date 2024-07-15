import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private MaintainCount count;

    public Adder(MaintainCount count){
        this.count = count;
    }

    public Void call() throws Exception {
        for(int i=1; i<=10; i++){
            count.value += 1;
        }
        return null;
    }
}

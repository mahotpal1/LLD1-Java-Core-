import java.util.concurrent.Callable;

public class Substractor implements Callable<Void> {
    private MaintainCount count;

    public Substractor(MaintainCount count) {
        this.count = count;
    }

    public Void call() throws Exception{
        for(int i=1; i<=100; i++){
            count.value -= i;
        }
        return null;
    }
}

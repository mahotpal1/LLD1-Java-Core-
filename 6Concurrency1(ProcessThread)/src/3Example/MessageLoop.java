
public class MessageLoop implements Runnable{
    @Override
    public void run() {
        count++;
        String strSample[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        try{
            for(int i=0; i<strSample.length; i++){
                // Pause for 4 seconds
                Thread.sleep(4000);
                System.out.println("Thread Name : " + Thread.currentThread().getName() + strSample[i]);
            }
        }catch(InterruptedException e){
            System.out.println("Thread Name : " + Thread.currentThread().getName() + "I was interrupted in between");
        }
    }
}
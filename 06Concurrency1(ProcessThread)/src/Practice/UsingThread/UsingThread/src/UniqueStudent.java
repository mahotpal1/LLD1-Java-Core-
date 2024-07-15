public class UniqueStudent extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Printing value = "+i+" from Thread" + Thread.currentThread().threadId());
        }
    }
}

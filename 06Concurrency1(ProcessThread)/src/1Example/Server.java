public class Server implements Runnable{
    private String name;

    public Server(String name){
        this.name = name;
    }

    @Override
    public void run(){
        try{
            for(int i=0; i<10; i++){
                // TO PRINT CURRENT THREAD NAME
                System.out.println("Current thread Name : " + Thread.currentThread().getName());
                System.out.println("My name is " + this.name);
                // Give 1 sec break after printing one name
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
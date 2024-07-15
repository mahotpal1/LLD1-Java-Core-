public class PrintNumber implements Runnable{
    private int numToPrint;
    public PrintNumber(int numToPrint){
        this.numToPrint = numToPrint;
    }

    public void run(){
        System.out.println(numToPrint + " in thread " + Thread.currentThread().getName());
    }
}
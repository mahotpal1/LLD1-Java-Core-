import java.util.*;

public class Server<T>{
    private ArrayList<T> list;

    public Server(ArrayList<T> list){
        this.list = list;
    }

    private boolean check(T i){
        if(i instanceof Integer){
            return true;
        }
        return false;
    }

    public int countOdd(){
        int count = 0;
        for(int i=0; i<this.list.size(); i++){
            if(check(this.list.get(i))){
                Integer val = (Integer)this.list.get(i);
                if(val%2 != 0){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean compareTwo(T t1, T t2){
        if(t1.equals(t2)){
            return true;
        }
        return false;
    }

    public boolean checkPalindrome(){
        int start=0, end=this.list.size()-1;

        while(start < end){
            if(!compareTwo(this.list.get(start), this.list.get(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
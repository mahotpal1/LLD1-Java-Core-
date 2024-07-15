import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> myList;
    // executor will create a task to perform each sorting.
    ExecutorService executor;

    public Sorter(List<Integer> myList, ExecutorService executor) {
        this.myList = myList;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        // Edge case: If there is one or no elements to sort.
        if(myList.size() <= 1){
            return myList;
        }
        // Mid element to store the mid index
        int mid = myList.size()/2;

        List<Integer> leftHalf = new ArrayList<>();
        for(int i=0; i<mid; i++){
            leftHalf.add(myList.get(i));
        }

        List<Integer> rightHalf = new ArrayList<>();
        for(int i=mid; i<myList.size(); i++){
            rightHalf.add(myList.get(i));
        }

        Sorter st1 = new Sorter(leftHalf, executor);
        Sorter st2 = new Sorter(rightHalf, executor);

        Future<List<Integer>> future1 = executor.submit(st1);
        Future<List<Integer>> future2 = executor.submit(st2);

        leftHalf = future1.get();
        rightHalf = future2.get();

        return getSorted(leftHalf, rightHalf);
    }

    private static List<Integer> getSorted(List<Integer> leftHalf, List<Integer> rightHalf) {
        List<Integer> mySortedArray = new ArrayList<>();

        int i=0, j=0;
        while(i< leftHalf.size() && j< rightHalf.size()){
            if(leftHalf.get(i)< rightHalf.get(j)){
                mySortedArray.add(leftHalf.get(i));
                i++;
            }else{
                mySortedArray.add(rightHalf.get(j));
                j++;
            }
        }

        while(i < leftHalf.size()){
            mySortedArray.add(leftHalf.get(i));
            i++;
        }

        while(j < rightHalf.size()){
            mySortedArray.add(rightHalf.get(j));
            j++;
        }
        return mySortedArray;
    }
}

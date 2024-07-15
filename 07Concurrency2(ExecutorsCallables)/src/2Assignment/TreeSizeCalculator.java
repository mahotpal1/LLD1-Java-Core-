import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer>{
    public Node root;
    public ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception{
        if (root == null){
            return 0;
        }

        Future<Integer> leftSizeFuture = null;
        Future<Integer> rightSizeFuture = null;

        if(root.left != null){
            leftSizeFuture = executorService.submit(new TreeSizeCalculator(root.left, executorService));
        }

        if(root.right != null){
            rightSizeFuture = executorService.submit(new TreeSizeCalculator(root.right, executorService));
        }

        int leftSize = 0;
        int rightSize = 0;

        if (leftSizeFuture != null) {
            leftSize = leftSizeFuture.get();
        }

        if (rightSizeFuture != null) {
            rightSize = rightSizeFuture.get();
        }

        return 1 + leftSize + rightSize;
    }
}
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TreeSizeCalculatorClient {
    public static void main(String[] args) {
        // Create the root node and build the tree
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.right.right = new Node(86);
        root.right.left = new Node(4);
        // Add more nodes as needed

        // Create ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(4); // Example with 4 threads

        // Create TreeSizeCalculator instance
        TreeSizeCalculator calculator = new TreeSizeCalculator(root, executorService);

        try {
            // Execute the calculation and get the result
            int treeSize = calculator.call();
            System.out.println("Size of the tree: " + treeSize);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Shutdown ExecutorService
            executorService.shutdown();
        }
    }
}
import java.util.ArrayList;
import java.util.List;
public class Utils{
    public static void simpleDoSomething(Animal animal){

    }

    // We can do it using generic to add list of object class also. This is wild class Syntax
    public static void doSomething(List<? extends Animal> animal){

    }

    // Better way to implement generic to add inherited objects, using generic form
    public static <T extends Animal> void doSomething2(List<T> animals){

    }
}
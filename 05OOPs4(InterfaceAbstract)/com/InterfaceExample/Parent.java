import java.util.Map;
import java.util.HashMap;

public class Parent implements Family{
    protected String parent_name;
    // Map to store number of children for each parent
    protected static Map<String, Integer> myFamilyMap = new HashMap<>();

    public Parent(String n){
        parent_name = n;
    }
    public int getChildCount(){
        return myFamilyMap.get(parent_name);
    }
    public void addChild(String parent_name) {
        if(myFamilyMap.containsKey(parent_name)){
            myFamilyMap.put(parent_name, myFamilyMap.get(parent_name)+1);
        }else{
            myFamilyMap.put(parent_name, 1);
        }
    }
    public void printDetails(){
        System.out.println("Name: " + parent_name);
    }
}
public class Child extends Parent{
    String name;

    public Child(String parent_name, String name){
        super(parent_name);
        this.name = name;
        super.addChild(parent_name);
    }

    @Override
    public void printDetails(){
        System.out.println("Parent Name: " + parent_name + ". My name: " + name);
    }
}
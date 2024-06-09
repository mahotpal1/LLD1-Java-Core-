public class Parent{
    protected String parent_name;
    protected int parent_age;

    public Parent(String name, int age){
        parent_name = name;
        parent_age = age;
    }

    public void printDetails(){
        System.out.println("My name is " + parent_name + " and I am " + parent_age + " years old.");
    }
}
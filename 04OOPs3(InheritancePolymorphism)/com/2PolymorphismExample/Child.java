public class Child extends Parent{
    private int age;
    private String name;

    public Child(String parent_name, int parent_age, int age, String name){
        super(parent_name, parent_age);
        this.age = age;
        this.name = name;
    }
    // Method Overridding
    public void printDetails(){
        System.out.println("My name is "+name+" and age is "+age+". My Parent name is "+parent_name+" and his age is "+parent_age);
    }
    // Method Overloadng
    public void printDetails(String happy){
        System.out.println(happy + " is happy today");
    }
}
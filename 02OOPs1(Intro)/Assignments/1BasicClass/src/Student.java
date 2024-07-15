/*
    Create a Student class satisfying following requirements

    It should have two data members:
        age: int
        name: String
    It should have a display method
        Signature : void:display()
        It should print : “My name is <name>. I am <age> years old”
    It should have a sayHello method
        Signature : void:sayHello(String)
        It should print : “<name data member> says hello to <name parameter>”
 */

public class Student{
    public int age;
    public String name;

    public void display(){
        System.out.println("My name is "+this.name+". I am "+this.age+" years old.");
    }

    public void sayHello(String name){
        System.out.println(this.name+" says hello to "+ name);
    }
}
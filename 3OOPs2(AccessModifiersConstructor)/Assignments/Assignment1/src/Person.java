/*
    Create a class Person with following requirements

    Should have a data-member age
    Should have a data-member name
    Should support a constructor with both age and name
 */

public class Person{
    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void printDetails(){
        System.out.println("My name is "+name+". and age is "+age+".");
    }
}
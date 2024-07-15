public class Student implements Runnable{
    private String name;
    private int age;

    private static Student runnableInstance = null;

    private Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static Student getInstance(String name, int age){
        if(runnableInstance == null){
            synchronized (Student.class){
                if(runnableInstance == null){
                    runnableInstance = new Student(name,age);
                }
            }
        }
        return runnableInstance;
    }

    public void print(){
        System.out.println(name + " " + age);
    }

    @Override
    public void run() {
        this.print();
    }
}

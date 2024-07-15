/*
    Write a program that computes your initials from your full name and displays them.
 */

class MyClass{
    public static void main(String[] args){
        String str = "Vishal Mahotpal";
        StringBuilder btr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                btr.append(x);
            }
        }
        System.out.println("Initial is : " + btr);
    }
}
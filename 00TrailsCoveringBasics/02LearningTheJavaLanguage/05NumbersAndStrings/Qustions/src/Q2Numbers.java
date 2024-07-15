/*
    What Integer method would you use to convert a string expressed in base 5 into the equivalent int? For example,
    how would you convert the string "230" into the integer value 65? Show the code you would use to accomplish this task.
 */

class Main{
    public static void main(String[] args){
        String decimalString = "230";
        int stringToBase5 = Integer.parseInt(decimalString, 5);
        System.out.println(stringToBase5);
    }
}
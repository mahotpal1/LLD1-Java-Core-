/*
//    Create a program that reads an unspecified number of integer arguments from the
      command line and adds them together. For example, suppose that you enter the following:

      Create a program that is similar to the previous one but has the following differences:

Instead of reading integer arguments, it reads floating-point arguments.
It displays the sum of the arguments, using exactly two digits to the right of the decimal point.
For example, suppose that you enter the following:

java FPAdder 1 1e2 3.0 4.754
The program would display 108.75. Depending on your locale, the decimal point might be a comma (,) instead of a period (.).
 */

import java.util.*;

class Main{
    public static void main(String[] args){
        int sum=0;
        for(String str: args){
            try{
                sum += Integer.parseInt(str);
            }catch(NumberFormatException e){
                System.out.println(str + " is not an integer");
            }
        }
        System.out.println("Sum of all the numbers is : "+sum);
    }
}
/*
    Show two ways to concatenate the following two strings together to get the string "Hi, mom."
 */

import java.util.*;

class MyClass{
    public static void main(String[] args){
        String str1 = "Hi, ";
        String str2 = "mom.";

        // Way 1
        System.out.println(str1+str2);
        // Way 2
        System.out.println(str1.concat(str2));
    }
}
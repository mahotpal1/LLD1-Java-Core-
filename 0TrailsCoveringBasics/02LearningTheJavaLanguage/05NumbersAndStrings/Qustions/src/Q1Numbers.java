/*
    What Integer method can you use to convert an int into a string that expresses the number in hexadecimal? 
    For example, what method converts the integer 65 into the string "41"
 */

import java.util.*;

class Main{
    public static void main(String[] args){
        int number = 65;
        String hexString = Integer.toHexString(number);
        System.out.println(hexString);
    }
}
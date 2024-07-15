/*
    What Double method can you use to detect whether a
    floating-point number has the special value Not a Number (NaN)?
 */

import java.util.*;

class Main{
    public static void main(String[] args){
        double d = Double.NaN;
        double df = 12.234d;

        if(Double.isNaN(d)){
            System.out.println("NaN");
        }else{
            System.out.println("Not NaN");
        }

        if(Double.isNaN(df)){
            System.out.println("NaN");
        }else{
            System.out.println("Not NaN");
        }
    }
}
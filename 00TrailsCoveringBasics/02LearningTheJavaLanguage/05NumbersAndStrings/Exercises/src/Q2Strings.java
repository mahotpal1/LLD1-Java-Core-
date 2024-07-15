import java.util.*;

class MyClass{
    public static void main(String[] args){
        /*
          Q1. What is the initial capacity of following string :
              StringBuilder sb = new StringBuilder("Hello World");
          Ans : 16(default) + 11(string size)
         */

        /*
          Q2. Consider the following string:
              String hannah = "Did Hannah see bees? Hannah did.";

                Question: What is the value displayed by the expression hannah.length()?
                Answer: 32.

                Question: What is the value returned by the method call hannah.charAt(12)?
                Answer: e.

                Question: Write an expression that refers to the letter b in the string referred to by hannah.
                Answer: hannah.charAt(15).
         */

        /*
          Q3. Question: How long is the string returned by the following expression? What is the string?
                "Was it a car or a cat I saw?".substring(9, 12)
          Answer: It's 3 characters in length: car. It does not include the space after car.
         */

        /*
          Q4. public class ComputeResult {
                public static void main(String[] args) {
                    String original = "software";
                    StringBuilder result = new StringBuilder("hi");
                    int index = original.indexOf('a');

                1   result.setCharAt(0, original.charAt(0));
                2   result.setCharAt(1, original.charAt(original.length()-1));
                3   result.insert(1, original.charAt(4));
                4   result.append(original.substring(1,4));
                5   result.insert(3, (original.substring(index, index+2) + " "));

                    System.out.println(result);
                }
            }
            Answer:

                    si
                    se
                    swe
                    sweoft
                    swear oft
         */
    }
}
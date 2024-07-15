/*
    Write a generic method to count the number of elements in a collection that have a specific property
    (for example, odd integers, prime numbers, palindromes)
 */
import java.util.*;

class Client{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 1)
        );

        Server<Integer> server = new Server<>(list);

        System.out.println("Number of odd in list: "+server.countOdd());
        System.out.println("Is array a palindrome: "+server.checkPalindrome());
    }
}

// Given an String, Write a java method that
// returns the decimal value for the given binary string.

/**
 * @author : Mounika2010
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /*
    Do not modify the main function.
    */
    private Solution() {
        //constructor.
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);

    }
    /**
     * Reverse string function.
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static String reverseString(final String s) {
        String varA = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            varA = varA + s.charAt(i);
        }
        return varA;
    }

}



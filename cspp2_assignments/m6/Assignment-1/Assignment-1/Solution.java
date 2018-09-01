import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : Mounika2010
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    /**
     * To check if the number is Odd.
     *
     * @param      i     element in input.
     *
     * @return     if even, returns false else returns true.
     */
    public static boolean Odd(final int i) {
        if (i%2 != 0) {
            return true;
        }
        return false;
    }
    
    /**
     * To check if the element is prime.
     *
     * @param      i     element in input
     *
     * @return     returns true if the number is composite else returns false.
     */
    public static boolean Composite(final int i) {
        for (int j = 2; j < i; j++) {
            if (i%j != 0) {
                return true;
            }
        }
        return false;
    }
    static void oddComposites(final int n) {
	for(int i = 1; i <= n; i++) {
        if (Composite(i) && Odd(i)) {
            System.out.println(i);
        }

    }
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}





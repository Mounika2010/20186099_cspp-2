/**
 * @author : Mounika2010.
 */
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // constructor.
    }

    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1,n2));
    }
    /*
	Need to write the gcd function and print the output.
	*/
    public static int gcd(final int n1, final int n2) {
        int gcd = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {

            }
        }
        return gcd;
    }
}

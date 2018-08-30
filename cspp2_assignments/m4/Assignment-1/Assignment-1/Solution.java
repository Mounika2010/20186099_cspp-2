/**
 * @author : Mounika2010
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /*
    Fill this main function to print maximum of given array
    */
    /**
     * Constructs the object.
     */
    private Solution() {
        //constructor is used.
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
        a[i] = s.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < len; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);

    }
}




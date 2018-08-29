/**
 * @author : Mounika2010.
 */
import java.util.Scanner;
/*
    Do not modify this main function.
    */
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * constructs the object.
     */
    private Solution() {
        // constructor.
    }
/* Fill the main function to print the number of 7's between 1 to n*/
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);      
        int n = s.nextInt();
        int i = 0;
        int count = 0;
        int val = 1;
        int a = 10;
        int b = 7;
        for (i = 0; i <= n; i++) {
            val = i;
            while (val != 0) {
            
                if (val % a == b) {
                    count++;
            }
                val = val / a;
            }
        }
        System.out.println(count);
        }

    }


  
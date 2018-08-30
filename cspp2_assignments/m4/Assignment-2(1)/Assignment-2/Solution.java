/**
 * @author : Mounika2010.
 */
import java.util.Scanner;
/**
 * { item_description }.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //constructor is used
    }
    /* Fill the main function to print resultant of addition of matrices*/
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int rowsA = s.nextInt();
        int colsA = s.nextInt();
        int[][] sum = new int[rowsA][colsA];
        int[][] a = new int[rowsA][colsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                a[i][j] = s.nextInt();
            }
        }
        int rowsB = s.nextInt();
        int colsB = s.nextInt();
        int[][] b = new int[rowsB][colsB];
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                b[i][j] = s.nextInt();
        }
        if (rowsA == rowsB && colsA == colsB) {
            for ( i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                    System.out.print(sum[i][j]);
                    if (j < colsA - 1) {
                        System.out.print(" ");
                    }
                }
            System.out.println();
            }
        } else {
            System.out.println("not possible");
        }
    }
}}
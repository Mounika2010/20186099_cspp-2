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
        //System.out.println("rowsA" + rowsA);
        int colsA = s.nextInt();
        //System.out.println("colsA" + colsA);
        //int sizeA = s.nextInt();
        //System.out.println("sizeA" + sizeA);
        int[][] sum = new int[rowsA][colsA];
        int[][] a = new int[rowsA][colsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                a[i][j] = s.nextInt();
            }
            //System.out.println(a[i] + "a");
        }
        //System.out.println(a);
        int rowsB = s.nextInt();
        //System.out.println("rowsB" + rowsB);
        int colsB = s.nextInt();
        //System.out.println("colsB" + colsB);
        //int sizeB = s.nextInt();
        //System.out.println("sizeB" + sizeB);
        int[][] b = new int[rowsB][colsB];
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                b[i][j] = s.nextInt();
            }
            //System.out.println(b[i] + "b");
        }
        //System.out.println(b);
        if (rowsA == rowsB && colsA == colsB) {
            for (int i = 0; i < rowsA; i++) {
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
}




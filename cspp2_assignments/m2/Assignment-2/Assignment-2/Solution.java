import java.util.Scanner;
/**
 * { item_description }.
 */
public final class Solution {
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		roots(a, b, c);
	}
	/**
	 * { function_description }
	 *
	 * @param      a     { parameter_description }
	 * @param      b     { parameter_description }
	 * @param      c     { parameter_description }
	 */
	public static void roots(final int a, final int b, final int c) {
		int det = (b * b) - (2 * 2 * a * c);
		double root1 = (-b + Math.sqrt(det)) / (2 * a);
		double root2 = (-b - Math.sqrt(det)) / (2 * a);
		System.out.println(root1 + " " + root2);
		}	
	/*
	Need to write the roots function and print the output.
	*/
}













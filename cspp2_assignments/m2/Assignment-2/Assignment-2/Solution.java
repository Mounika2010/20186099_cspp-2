import java.util.Scanner;
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
		rootsOfQuadraticEquation(a, b, c);
	}
	public static void rootsOfQuadraticEquation(final int a, final int b, final int c) {
		int det = (b * b) - (4 * a * c);
		double root1 = (-b + Math.sqrt(det))/ (2 * a);
		double root2 = (-b - Math.sqrt(det))/(2 * a);
		System.out.println(root1 + " " + root2);
		}	
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
}


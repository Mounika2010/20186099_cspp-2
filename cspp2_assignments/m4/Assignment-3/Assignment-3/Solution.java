
// Given an String, Write a java method that returns the decimal value for the given binary string.
/**
* author : Mounika2010
*
*/
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution
{/*
	Do not modify this main function.
	*/
	private Solution() {
		//constructor.
	}
	/**
	 * Main function.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<=n;i++){
			String s=sc.nextLine();
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
/**
 * converting to binary.
 *
 * @param      s     string input
 *
 * @return     returns integer value
 */
	public static String binaryToDecimal(final String s) {
        double sum = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char a = s.charAt(i);
            int value = Character.getNumericValue(a);
            sum += (value * Math.pow(2, (s.length() - 1) - i));
        }
        int inp = (int) sum;
        String b = Integer.toString(inp);
        return b;
    }
}



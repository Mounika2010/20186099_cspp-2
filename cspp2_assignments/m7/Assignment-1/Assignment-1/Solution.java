/**
 * @author : Mounika2010.
 */
import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
	/**
	 * variable description.
	 */
	private String input;

	/**
	 * Constructs the object.
	 *
	 * @param      temp  The temporary
	 */
	InputValidator(final String temp) {
		this.input = temp;
	}
	/**
	 * returns true or false.
	 *
	 * @return     { description_of_the_return_value }
	 */
	boolean validateData() {
	final int a = 6;
	if (input.length() >= a) {
		return true;
		}
		return false;
	}

}
/**
 * class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		//constructor is used.
	}
	/**
	 * Main function.
	 * 
	 * @param      args  The temporary     
	 */
	public static void main(final String[] args) {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}




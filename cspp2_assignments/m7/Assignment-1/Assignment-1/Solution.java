import java.util.Scanner;
class InputValidator {
	private String input;

	InputValidator(final String temp) {
		this.input = temp;
	}
	boolean validateData() {
	final int z = 6;
	if (input.length() >= z) {
		return true;
		}
		return false;
	}

}
public final class Solution {
	private Solution() {
		//constructor is used.
	}
	public static void main(final String args[])
    {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}

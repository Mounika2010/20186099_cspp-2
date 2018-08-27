/*
*author : Mounika2010
*/
public final class Swap {
	/**
	*empty constructor.
	*/
	private Swap() {

	}
	/**
	*main function to print the swapping of two numbers
	* @param args is the parameter for this parameter
	*/
	public static void main(final String[] args) {
		int a = 2;
		int b = 3;
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println(a + " " + b);
	}
}






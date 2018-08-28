public class factorial {
	static int fact(int x) {
		if (x == 0)
		{
			return 1;

		}
		if (x == 1)
			return 1;
		else
			return x * fact(x -1);
	}

	public static void main(String[] args) {
		int a = fact(7);
		System.out.println(a);

	}
}
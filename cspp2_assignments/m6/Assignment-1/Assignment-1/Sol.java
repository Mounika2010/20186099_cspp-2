import java.util.*;
class Sol {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean temp = Composite(n);
        System.out.println(temp);
	}

	public static boolean Composite(int i) {
		for (int j = 2; j < i; j++) {
			if (i%j == 0) {
				return true;
			}
		}
		return false;

	}
}
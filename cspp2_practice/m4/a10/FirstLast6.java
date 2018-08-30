import java.util.Scanner; 
public class FirstLast6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] a = new int[len];
        for(int i = 0; i<len; i++) {
        a[i] = s.nextInt();	
        } 
        if (a[0] == 6 || a[len-1] == 6)
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
	}
}
/**
 * @author : Mounika2010.
 */
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int i = 0;
        int count = 0;
        int val = 1;
        int a = 7;
        int b = 10;
       	for(i=0; i<=n; i++) {
       		while(val != 0) {
        	
        	if(val % a == b) {
        		count++;
        	}
      		val = val / a;
        	}
        	System.out.println(count);
       	}
        }

    }    

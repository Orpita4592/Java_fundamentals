package while_loop;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0 , b = 0 , c = 1; 
		
		for ( int i = 1 ; i <= n; i++) {
			a = b; 
			System.out.print(a +" ");
			b = c;
			c = a + b;
		}
		System.out.println();
		System.out.println(a);
	}

}

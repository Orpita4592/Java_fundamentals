package while_loop;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		while (i < n && n!= 2) {
			
			if (n %i == 0) {
				
				System.out.println("not a prime");
				break;
			}
			i++;
			
		}
		if (i == n)
			System.out.println("prime");
	}
		

}

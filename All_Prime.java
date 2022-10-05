package while_loop;
import java.util.Scanner;
public class All_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ( n >= 0 && n <= 100) {
			
		
		for( int i = 2; i<= n; i++) {
			boolean isPrime = true;
			for( int j = 2;j <= Math.sqrt(i); j++){
				
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
		
	}

	}

}

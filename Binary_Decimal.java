package while_loop;
import java.util.Scanner;

public class Binary_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		if (n >= 0 && n <= 100000000) {
			
		
		    for (int i =0 ;n > 0; n/=10) {
			rev = rev + (n % 10) * (int)(Math.pow(2,i));
			i++;
			
			
		    }
		    System.out.println(rev);
		}
		else {
			System.out.println("out of range");
		}

		
		
	}

}

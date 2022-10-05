package while_loop;
import java.util.Scanner;

public class Decimal_Binary {
	 
	public static int convertor(int n) {
		int rev = 0, i = 1;
		for(int k = n; k > 0; k /= 2) {
			int j = k % 2;
			rev = rev + j * i;
			i *= 10;
			}
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev =  convertor(n);
		System.out.println(rev);
		
		
		
		
		

	}

	 
}

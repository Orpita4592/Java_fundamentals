package while_loop;
import java.util.Scanner;
public class Digit_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		int se = 0;
		int so = 0;
		while (x > 0){
			int j = x%10;
			if (j % 2 == 0)
				se = se + j;
			else 
				so = so + j;
			x/=10;
				
				
		}
		System.out.println(se + " " + so);
	}

}

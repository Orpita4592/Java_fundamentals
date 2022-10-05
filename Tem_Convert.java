package while_loop;
import java.util.Scanner;
public class Tem_Convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		if ((S>= 0 && S <=80) && (E >= S && E<= 900) && ( W >= 0 && W<= 40)) {
			
			while (S <= E) {
				
				System.out.print(S);
				System.out.print("   ");
				System.out.print((int)((5.0/9)*(S-32)));
				S= S + W;				
				System.out.println();
				}
			
		}
		else 
			System.out.print("wrong input");
		
	}

}

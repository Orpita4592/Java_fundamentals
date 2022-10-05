package while_loop;
import java.util.Scanner;
public class Ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int k = 0;
		for(int i = 1; i <= 10000; i++ ) {
			if(k != x) {
				
				int p = 3 * i +2;
		        if (p % 4 != 0) {
		        	
				   System.out.print(p + " ");
				   k++;
		        }
			
		        
			}
			else {
				break;
			}
			}
				
			}
			
			
			
		}



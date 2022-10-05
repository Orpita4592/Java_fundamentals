package pattern;

import java.util.Scanner;

public class Dimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int space = 1;
		while (i <= n) {
			if (i <= n/2+1) {
				int j = n/2 + 1 - i;
			    while ( j >= 1) {
				    System.out.print(" ");
				    j--;
			    }
			    j = 1;
			    while (j <= 2 * i - 1) {
				    System.out.print("*");
				    j++;
			 }
			}
			else {
				
				int j = 1;
				while (j <= space) {
					System.out.print(" ");
				    j++;
				    }
				space= space + 1;
				j = 1;
				while (j <= 2*(n-i) + 1) {
					System.out.print("*");
					j++;
				}
				
			}
			System.out.println();
			i++;
			
			
			
		}
		
		}
		
		
	}

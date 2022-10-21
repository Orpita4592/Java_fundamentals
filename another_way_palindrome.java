package strings;

import java.util.Scanner;
public class another_way_palindrome {
	
	public static boolean check(String str) {
		int l= str.length();
		String str1="";
		for(int i=l-1;i>=0;i--){
			str1=str1+str.charAt(i);
		}
		for(int i=0;i<l;i++) {
			if(str1.charAt(i)!=str.charAt(i)) {
				return false;
				
			}
		}return true;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String tstr=sc.nextLine();
			System.out.println(check(tstr));
		}
		
		
	}


package questions;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		    String A=sc.next();
			StringBuilder sb = new StringBuilder(A);
			String s1 = sb.toString();
			StringBuilder sb2 = sb.reverse();
			String s2 = sb2.toString();
			
			for(int i = 0; i<s1.length(); i++){
				
				if(s1.charAt(i) == s2.charAt(i))
					System.out.println("Yes");
				else System.out.println("No"); break;
				
			}
			
		
	}
	
}

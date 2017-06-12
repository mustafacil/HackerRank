package questions;

import java.util.Scanner;

public class JavaStringsIntrodiction {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		System.out.println(A.length()+B.length());
		if(A.compareTo(B)<=0)System.out.println("No");
		else System.out.println("Yes");
		String s1 = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
		String s2 = B.substring(0, 1).toUpperCase() + B.substring(1, B.length()); 
		System.out.println(s1 + " " + s2);
		
	}
	
	
}

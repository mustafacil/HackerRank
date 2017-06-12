package questions;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int i = scan.nextInt();
		String[] dizi = new String[s.length()-i+1];
		for(int j=0; j<dizi.length; j++){
			
			dizi[j] = s.substring(j, i++);
			
		}
		Arrays.sort(dizi);
		System.out.println(dizi[0]);
		System.out.println(dizi[dizi.length-1]);
		
	}
	
	
}

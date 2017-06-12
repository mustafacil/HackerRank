package questions;


import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	 static int birthdayCakeCandles(int n, int[] ar) {
	        
		
		 Arrays.sort(ar);
		 int sayi=1;
		 for(int i = n-1; i>=1; i--){
			 
			 if(ar[i] == ar[i-1]){
				 sayi++;
				
			 }else break;
		 }
		 
		 return sayi;
			
		
		 
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = birthdayCakeCandles(n, ar);
	        System.out.println(result);
	    }
	
}

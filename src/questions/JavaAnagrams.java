package questions;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
        
		boolean sonuc =false;
		char[] dizi1 = new char[a.length()];
		char[] dizi2 = new char[b.length()];
		
		for(int i = 0; i<a.length(); i++){
			dizi1[i] = a.toLowerCase().charAt(i);
			
		}
		for(int i = 0; i<b.length(); i++){
			dizi2[i] = b.toLowerCase().charAt(i);
			
		}
		
		Arrays.sort(dizi1);
		Arrays.sort(dizi2);
		
		int sayac = 0;
		if(dizi1.length != dizi2.length)
			sonuc = false;
		else{
			for(int i=0; i<dizi1.length; i++){
				
				if(dizi1[i] == dizi2[i])
				sayac++;
				
			}
		}
			
		if (sayac == dizi1.length)
			sonuc = true;
		else 
			sonuc = false;
				
		return sonuc;
    }
	
	
	 public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	
	
}

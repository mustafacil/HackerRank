package questions;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine().trim();
	        int sayi = 0;
	        String[] dizi = null;
	        if(s.equals(""))
	            sayi = 0;
	        else{
	     dizi = s.split("\\s+|\\s+\\p{Punct}|,+\\s{0,}+|!+\\s{0,}+|'+\\s{0,}+|\\?+\\s{0,}+|\\.+\\s{0,}+|_+\\s{0,}+|@+\\s{0,}+");
	        sayi = dizi.length;       
	        }

			System.out.println(sayi);
			for (String ts : dizi)
				System.out.println(ts);
	        scan.close();
		
	}

}

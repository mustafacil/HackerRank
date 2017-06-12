package questions;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		

		 Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String us = nf1.format(payment);
		String india = nf2.format(payment);
		String china = nf3.format(payment);
		String france = nf4.format(payment);
		

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
		
		
	}
	
}

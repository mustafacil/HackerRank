package questions;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;


public class JavaDateandTime {

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
		
		String input = day+"/"+month+"/"+year;
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		Date dt1 = f1.parse(input);
		Calendar gc = new GregorianCalendar();
		gc.setTime(dt1);
		String dayOfWeek = gc.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		System.out.println(dayOfWeek.toUpperCase());
		
		
	}
	
}

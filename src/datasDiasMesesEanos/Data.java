package datasDiasMesesEanos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	
	/*Formatos possiveis para DATAS com o SimpleDateFormat
	 * y = year
	 * M upperCase = Month in year
	 * D upperCase =  - day in year
	 * d lowerCase = day in Month
	 * H upperCase = hour in a day
	 * h lowerCase = hour in am/pm
	 * m lowerCase = Minute in hour
	 * s lowerCase = Second in minute
	 * S upperCase = Millisecond Number */

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("y/D");
		String data = formatar.format(date);
		
		System.out.println(data);

	}

}

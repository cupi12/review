package part2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static String today() {
		Date day = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		return format.format(day);
	}// end of today()

	public static String strDate(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String a = format.format(date);
		return a;
//		long a =  day.getTime();
//		return Long.toString(a);
	}// end of strDate()
	
	public static String strDate(Date date, String pattern) { //오버로딩
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		String a = format.format(date);
		return a;
	}
}// end of class

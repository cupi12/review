package review.wrap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeTest {

	public static void main(String[] args) throws ParseException { // 형변환 시킴
		// 1. int -> String
		int num = 10;
		String str = Integer.toString(num);
		System.out.println("16진수 : " + Integer.toHexString(num)); // Hex = 16진수

		// 2. double -> String
		double dNum = 3.14;
		System.out.println("double -> String : " + Double.toString(dNum));

		// 3. String -> int
		String snum = "1010";
		num = Integer.parseInt(snum);

		// 4.String -> double(원시)
		dNum = Double.parseDouble(snum);

		// 5.String -> Double(객체)
		Double dobj = Double.parseDouble(snum);

		// 6.double -> int (기본)
//		num = Integer.parseInt(Double.toString(dNum));
		num = (int) dNum;

		// 7. Double -> int (객체)
		num = dobj.compareTo(dobj); // compareTo

		// 8. Date -> long int
		Date today = new Date();
		long todayNum = today.getTime();
		System.out.println("todayNum : " + todayNum);
		// 9.long -> Date
		Date hireDate = new Date(todayNum);
		System.out.println("Date -> long : " + hireDate);

		// 10. Date -> String //SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate = format.format(hireDate);
		System.out.println("Date -> Strig : " + strDate);

		// 11. String -> Date
		String xmas = "2020/12/25   12:00";
		SimpleDateFormat xformat = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		hireDate = xformat.parse(xmas);
		System.out.println("String -> Date : " + hireDate);

	}
}

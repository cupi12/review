package part2;

import java.util.Calendar;
import java.util.Date;

public class TestClass {
	public static void main(String[] args) {
//		PrintClass pc = new PrintClass();  //hip, stack 영역에 올린겨우
		//인수도 없고 리턴값도 없는 매서드
		PrintClass.print(); //Static 영역에 올린경우
		//인수가 있는경우
		PrintClass.print("*");
		//인수가 2개인경우
		PrintClass.print("3",30);
		
		int num1 = 10;
		int num2 = 20;
		int result = SumClass.total(num1, num2);
		System.out.println(result);
		
		System.out.println(SumClass.total(num1, num2,50));
		
		String day = DateUtil.today();
		System.out.println(day);
		
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(1994,06,12);
		String birth = DateUtil.strDate(birthDay.getTime());
		System.out.println(birth);
		
		String birth2 = DateUtil.strDate(birthDay.getTime(),"YYYY");
		System.out.println(birth2);
	}
}

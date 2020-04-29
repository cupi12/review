package test;

import java.math.BigDecimal;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Part1_arTest {
	public static void main(String[] args) {
		// 8가지 byte, short, int, long||float, double, boolean, char
		//정수는 최대숫자 주의
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		// overflow를 방지하기 위하여 타입 지정한다.
		// BigDecimal
		// 실수 -> 유효자리 (주의하기)
//		0.00001 1*10^-6    
//		100000  1*10^6
		//0.12345678 -> 1.2345678 * 10^-7
		float fnum = 0.123456789f;  //유효자리수 7자리
		System.out.println(fnum);
		double dnum = 0.123456789;  //유효자리수 15자리
		System.out.println(dnum);
		//char -> 유니코드, 아스키코드 등
		char c = '가';
		System.out.println(Integer.toHexString(c));
		char c1 = '\uac88';
		System.out.println(c1);
		char c2 = 'A';
		System.out.println((char)(c2+32));
		for(int i=0; i<127; i++) {
			System.out.print(i + ":" + (char)(i) );			
		}
		System.out.println();
		//상수타입
		//기본타입 : int, long
		long lnum = 100000000000000l;
		System.out.println(lnum);
	}//end of main
}

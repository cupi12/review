package test;

public class OperatorTest {
	public static void main(String[] args) {
		// 삼항연산
		int score = 80;
		String grade = score >= 60 ? "success" : "fail";
		boolean booleangrade = score >= 60 ? true : false;
		char chargrade = score >= 90 ? 'A' : score >= 80 ? 'B' : 'C'; // 90 > A 80 >b 아니면c
		System.out.println(chargrade);

		char c1 = 0xAC00;
		System.out.println(c1);
		int a1 = 0x10; // 0x = 16
		int b2 = 010; // 0 = 8
		int c3 = 10; // 10진수
		System.out.println("%5d%5d%5d,a1,b2,c1");
		// 증감
		int a = 10;
		int b = 15;
		int c = a++ + ++b;
		System.out.println(String.format("%d,%3d,%3d", a, b, c));

		// 논리(&& , || , !) a값이 10~20사이인지 검사

		boolean bo = (a >= 10 && a <= 20);
		System.out.println(bo);
		boolean bo1 = (a <= 10 || a >= 20); // == !(a>=10 && a<=20)
		System.out.println(bo1);

		// a와 b의 범위가 10~20사이인지 비교
		boolean b3 = (a <= b && (a >= 10 && a <= 20) && (b >= 10 && b <= 20));
		System.out.println(b3);

//		Integer inta = 10;
//		Integer intb = null;
//		bo = inta>= 10 && intb>=20;
//		System.out.println(bo);
//						
	}
}

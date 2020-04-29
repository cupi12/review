package test;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		// 조건 10회 이내 3s이면 종료

		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 10);
		int c = (int) (Math.random() * 10);

		int i = 1;
		int cnt = 10;
		while (i <= 11) {
			Scanner scn = new Scanner(System.in);
			System.out.println("1번째 숫자 입력>");
			int num1 = scn.nextInt();
			scn.nextLine();
			System.out.println("2번째 숫자 입력>");
			int num2 = scn.nextInt();
			scn.nextLine();
			System.out.println("3번째 숫자 입력>");
			int num3 = scn.nextInt();
			scn.nextLine();

			System.out.println("입력한 숫자 => " + num1 + " " + num2 + " " + num3 + " || " + "남은 횟수[" + cnt + "]");

			if (num1 == a && num2 == b && num3 == c) {
				System.out.println("All Strike!");
				break;
			} else if (num1 == a && num2 == b && num3 != c) {
				System.out.println("2S 1B");
				cnt--;
				i++;
				continue;
			} else if (num1 == a && num2 != b && num3 == c) {
				System.out.println("2S 1B");
				cnt--;
				i++;
				continue;
			} else if (num1 != a && num2 == b && num3 == c) {
				System.out.println("2S 1B");
				cnt--;
				i++;
				continue;
			} else if (num1 == a && num2 != b && num3 != c) {
				System.out.println("1S 2B");
				cnt--;
				i++;
				continue;
			} else if (num1 != a && num2 == b && num3 != c) {
				System.out.println("1S 2B");
				cnt--;
				i++;
				continue;
			} else if (num1 != a && num2 != b && num3 == c) {
				System.out.println("1S 2B");
				cnt--;
				i++;
				continue;
			} else if (num1 != a && num2 != b && num3 != c) {
				System.out.println("3B");
				cnt--;
				i++;
				continue;
			}

		} // end of while
		System.out.println("Game Over");

	}// end of main

}// end of class

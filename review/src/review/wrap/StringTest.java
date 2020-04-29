package review.wrap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

	public static void main(String[] args) {

		// 검색
		String path = "c:/app/images/pig.jpg";
		// 1. 맨 끝의 "/" 위치(lastindexof)
		int idex = path.lastIndexOf("/");
		System.out.println("맨 끝의 \"/\" 위치 " + idex);

		// 2. 파일명만 추출 lastindexof, subString
//		int last = path.lastIndexOf("j");
//		System.out.println("파일명 시작번호 추출 : " +last);
		String a = path.substring(idex + 1);
		System.out.println("파일명 추출 : " + a);
		// 3. 파일이 jpg로 끝나는지 체크 endWith
		boolean jpgyn = path.endsWith("jpg");
		System.out.println("파일이 jpg로 끝나는지 체크 : " + jpgyn);
		// 4. 문자열 자르기 split
		String[] paths = path.split(a);
		System.out.println("paths출력 : " + paths);
		for (String p : paths) {
			System.out.println(p);
		}
		// 패턴 체크(대, 소, 특, 자리수) regexp(regular expresstion : 정규 표현식)
		String pattern = "\"^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$\"\r\n" + 
				"";
		String pw = "asdasdff1234A! ";
		boolean result = validationPasswd(pw, pattern);
		System.out.println("패턴검사 : " + result);

	}// end of main

	private static boolean validationPasswd(String pw, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(pw);

		if (m.matches()) {
			return true;
		}
		return false;
	}
}// end of class

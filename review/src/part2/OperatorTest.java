package part2;

public class OperatorTest {

	public static void main(String[] args) {
		OperatorClass op = new OperatorClass(); 
		op.setNum(10,20); //num1, num2 초기화
		int result = op.sum(); //두 수의 합을 리턴
		System.out.println(result);
	}

}

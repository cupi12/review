package part2;

public class OperatorClass {
	private int num1, num2, result;
	
	public void setNum(int a, int b) {		
		num1 = a;
		num2 = b;
	}
	
	public int sum() {
		int result = num1 + num2;
		return result;
	}
}//end of class

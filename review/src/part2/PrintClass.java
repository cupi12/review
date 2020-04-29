package part2;

//1.클레스 정의
public class PrintClass {
	public static void print() {
		for (int i = 0; i <= 20; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public static void print(String shape) {
		for (int i = 0; i <= 20; i++) {
			System.out.print(shape);
		}
		System.out.println();
	}
	
	public static void print(String shape,int length) {
		for (int i = 0; i <= length; i++) {
			System.out.print(shape);
		}
		System.out.println();
	}

}

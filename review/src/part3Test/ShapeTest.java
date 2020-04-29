package part3Test;

import java.util.ArrayList;

import part3.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		// 다형성
		// 1. 부모 타입의 참조변수가 자식객체를 참조할 수 있다.
		// 2. 메서드 실행시, 참조하는 객체의 메서드 호출
		Shape s = new Circle();
		s.area();
		int r = ((Circle)s).getRadius();
		s = new Rect();
		s.area();
		System.out.println("----------------");
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Circle());
		list.add(new Rect());
		list.add(new Triangle());
		for(Shape temp : list) {
			temp.area();
		}
		

	}
}

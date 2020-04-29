package part3Test;

import part3.Movable;
import part3.Shape;

//Shape 상속, Drawable 상속
public class Triangle extends Shape implements Movable {
	int endx, endy;

	@Override
	public void move() {

	}

	@Override
	public double area() {
		return 0;
	}
	// endx, endy, 생성자

	
	//생성자
	public Triangle(int startx, int starty, int endx, int endy) { 
		super(startx,starty);
		this.endx = endx;
		this.endy = endy;
	}

	public Triangle() {//default 생성자
		super();
	}	
}

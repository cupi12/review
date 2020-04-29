package part3Test;
//Shape 상속, Movable 상속

import part3.Movable;
import part3.Shape;

public class Rect extends Shape implements Movable{
	
	int endx, endy;
	
	@Override
	public void move() {
		
	}

	@Override
	public double area() {
		System.out.println("Rectangle area");
		return 0;
	}
	//endx, endy, 생성자

	public Rect() {
		super();
	}

	public Rect(int startx, int starty, int endx, int endy) {
		super(startx,starty);
		this.endx = endx;
		this.endy = endy;
	}

	public int getEndx() {
		return endx;
	}

	public void setEndx(int endx) {
		this.endx = endx;
	}

	public int getEndy() {
		return endy;
	}

	public void setEndy(int endy) {
		this.endy = endy;
	}		
	
}


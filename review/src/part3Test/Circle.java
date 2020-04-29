package part3Test;

import part3.Drawable;
import part3.Movable;
import part3.Shape;

public class Circle extends Shape implements Drawable, Movable {
	
	private int radius;

	public Circle() {}

	public Circle(int startx, int starty, int radius) {
		super(startx, starty);
		this.radius = radius;
		
	}
	@Override
	public double area() {
		System.out.println("Circle Area");
		return 0;
	}

	@Override
	public void move() {
		System.out.println("circle move");
	}

	@Override
	public void draw() {
		System.out.println("circle draw");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

}

package part3;

public class Shape {
	
	public static String brand = "yedam";
	protected int startx;
	protected int starty;
	protected int color;
	protected int width;

	public double area() {
		System.out.println("Shape area");
		return 0;
		
	};

	public Shape() {
		System.out.println("shape 생성자");
	}

	public Shape(int startx, int starty) {
		this.startx = startx;
		this.starty = starty;

	}

	public int getStartx() {
		return startx;
	}

	public void setStartx(int startx) {
		this.startx = startx;
	}

	public int getStarty() {
		return starty;
	}

	public void setStarty(int starty) {
		this.starty = starty;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}

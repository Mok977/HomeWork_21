package hw5.HW5_4;

public class MyRectangle {
	private double width;
	private double depth;
	
	// 使用public MyRectangle()建構子建立物件
	public MyRectangle() {
		this.width = 0;
		this.depth = 0;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	//使用public MyRectangle(double width, double depth)建構子建立物件
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	
	public double getArea() {
		return width * depth;
	}
}

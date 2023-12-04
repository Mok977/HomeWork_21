package hw5.HW5_4;

public class MyRectangleTest {
	public static void main(String[] args) {
		
		// 使用public MyRectangle()建構子建立物件
		MyRectangle rectangle = new MyRectangle();
		
		rectangle.setWidth(10);
		rectangle.setDepth(20);
		System.out.println("面積:" + rectangle.getArea());
		
		//使用public MyRectangle(double width, double depth)建構子建立物件
		MyRectangle rectangle2 = new MyRectangle(10, 20);
		
		System.out.println("面積:" + rectangle2.getArea());
	}
}

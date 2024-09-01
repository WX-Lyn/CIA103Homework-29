package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle p1 = new MyRectangle();
		MyRectangle p2 = new MyRectangle(10,20);
		
		System.out.println(p1.getArea());
		System.out.println(p2.getArea());
	}
}

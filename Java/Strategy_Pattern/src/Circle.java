
public class Circle extends Shape{
	public Circle() {
		setCalculateArea(new CircleArea());
	}
	
	public void display() {
		System.out.println("\nCircle");
	}
}

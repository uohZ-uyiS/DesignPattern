
public class Square extends Shape{
	public Square() {
		setCalculateArea(new SquareArea());
	}
	
	public void display() {
		System.out.println("\nSquare");
	}
}

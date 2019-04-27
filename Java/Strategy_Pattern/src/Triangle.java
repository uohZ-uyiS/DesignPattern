
public class Triangle extends Shape{
	public Triangle() {
		setCalculateArea(new CantCalculate());
	}
	public void display() {
		System.out.println("Triangle");
	}
	
}

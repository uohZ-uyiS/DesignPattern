
public class Shape {
	CalculateArea calculateArea;
	
	public Shape() {}
	
	public void setCalculateArea(CalculateArea circleArea) {
		this.calculateArea = circleArea;
	}
	public void performcalculation(double length) {
		calculateArea.area(length);
	}
	
	void display() {
		System.out.println("\nShape");
	}
}

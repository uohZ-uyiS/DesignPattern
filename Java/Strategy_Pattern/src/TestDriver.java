import java.util.LinkedList;
import java.util.List;

public class TestDriver {
	public static void main(String[] args) {
		List<Shape> shapes = new LinkedList<Shape>();
		shapes.add(new Circle());
		shapes.add(new Square());
		shapes.add(new Triangle());
		Shape triangle = new Triangle();
		shapes.add(triangle);
		Process(shapes);
		triangle.setCalculateArea(new SquareArea());
		Process(shapes);
	}
	public static void Process(List<Shape> shapes) {
		for(Shape s : shapes) {
			System.out.println("Name: " + s.getClass().getName());
			s.performcalculation(3);
			s.display();
			//System.out.println("\n");
		}
		System.out.println("\nDone\n");
	}
}

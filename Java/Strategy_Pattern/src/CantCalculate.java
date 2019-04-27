
public class CantCalculate implements CalculateArea{

	@Override
	public void area(double length) {
		System.out.println("Opps, I don't know how to calculate");
	}

}

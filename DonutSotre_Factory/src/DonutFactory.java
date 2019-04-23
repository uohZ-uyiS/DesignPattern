
public class DonutFactory {
	private Donut donut;
	public Donut createDonut(String customeName, String type) {
		switch(type) {
		case "CDD":
			return donut = new ChocolateDipDonut(customeName);
		case "SD":
			return donut = new StrawberryDonut(customeName);
		case "DCD":
			return donut = new DoubleChocolateDonut(customeName);
		default:
			System.out.println("We don't have this type donut");
			return null;
		}
		/*if(type.equals("CDD")) {
			return donut = new ChocolateDipDonut(customeName);
		}else {
			return null;
		}*/
		
	}
}


public class DonutStore {
	private DonutFactory donutFactory = new DonutFactory();
	public DonutStore(DonutFactory donutFactory) {
		this.donutFactory = donutFactory;
	}
	public Donut orderDonut(String customerName, String donutType) {
		Donut donut = donutFactory.createDonut(customerName, donutType);
		if(donut != null) {
		System.out.println("------" + donut.getCustomerName() + " Order Donut---------");
		System.out.println("--------"
				+ "Track me --------");
		donut.showRecipe();
		donut.prepare();
		donut.bake();
		donut.pakage();
		return donut;}else {
			System.out.println("Enter the information next time");
			return null;
		}
	}
}

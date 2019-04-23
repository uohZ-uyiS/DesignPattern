import java.util.Scanner;

public class DonutTestDrive {
	public static void main(String[] args) {
		DonutFactory donutFactory = new DonutFactory();
		DonutStore donutStore = new DonutStore(donutFactory);
		Donut donut = null;
		System.out.println("Enter the CustomerName:");
		Scanner customerNameInput = new Scanner(System.in);
		if(customerNameInput.hasNextLine()) {
			String customerName = customerNameInput.nextLine();
			System.out.println("Enter the DonutType:");
			Scanner donutTypeInput = new Scanner(System.in);
			if(donutTypeInput.hasNextLine()) {
				String donutType = donutTypeInput.nextLine().toUpperCase();
				donut = donutStore.orderDonut(customerName, donutType);
			}
		}
		
		
	}
}

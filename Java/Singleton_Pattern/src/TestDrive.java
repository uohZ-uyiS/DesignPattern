
public class TestDrive {
	public static void main(String[] args) {
		SingletonRadio fisrtRadio = SingletonRadio.getInstance("Cool Radio", 100);
		SingletonRadio secondRadio = SingletonRadio.getInstance("Not Cool Radio", 200);
		RadioVolumn rv1 = new RadioVolumn(fisrtRadio);
		rv1.TurnOn();
		RadioVolumn rv2 = new RadioVolumn(secondRadio);
		rv2.TurnOn();
		// check whether two objects point to the same object, compare object references
		if(fisrtRadio == secondRadio) {
			System.out.println("Same Radio\n");
			rv1.TurnUp(10);
			rv2.TurnUp(20);
			fisrtRadio.printVolumn();
		} 	
		else
			System.out.println("Oops!There are two objects");
		
	}
}

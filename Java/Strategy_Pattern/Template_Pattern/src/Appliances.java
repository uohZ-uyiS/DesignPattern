
public abstract class Appliances {
	final void runAppliances() {
		turnOn();
		turnUp();
		turnDown();
		turnOff();
	}
	
	abstract void turnUp();
	abstract void turnDown();
	
	void turnOn() {
		System.out.println("Hi, I am starting to wrok!");
	}
	void turnOff() {
		System.out.println("Bye!");
	}
}


public class AirCondition {
	public int temperature;
	public AirCondition(int temperature) {
		this.temperature = temperature;
	}
	
	public void on() {
		System.out.println("The AirCondition is on");
	}
	public void setTemperature(){
		System.out.println("The temperature is set as " + temperature);
	}
	public void off() {
		System.out.println("The AirCondition is off");
	}

}

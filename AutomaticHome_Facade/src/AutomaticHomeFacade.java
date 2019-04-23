
public class AutomaticHomeFacade {
	TheLight light;
	AirCondition airCondition;
	VoiceMessage voiceMessage;
	
	public AutomaticHomeFacade(TheLight light
			,AirCondition airCondition
			,VoiceMessage voiceMessage) {
		this.light = light;
		this.airCondition = airCondition;
		this.voiceMessage = voiceMessage;
	}
	
	public void ArriveHome() {
		System.out.println("Weclome back home, prearing start");
		light.on();
		airCondition.on();
		airCondition.setTemperature();
		voiceMessage.on();
		voiceMessage.off();
		System.out.println("Weclome back home, finished start");
	}
	
	public void LeaveHome() {
		System.out.println("Prearing turn off electric appliance");
		light.off();
		airCondition.off();
		System.out.println("Have a nice day");
	}
}

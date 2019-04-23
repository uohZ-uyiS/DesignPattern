
public class AutomaticHomeTestDrive {
	public static void main(String[] args) {
		TheLight light = new TheLight();
		AirCondition airCondition = new AirCondition(23);
		VoiceMessage voiceMessage = new VoiceMessage();
		AutomaticHomeFacade automatic = new AutomaticHomeFacade(light
											, airCondition, voiceMessage  );
		automatic.ArriveHome();
		automatic.LeaveHome();
	}
}

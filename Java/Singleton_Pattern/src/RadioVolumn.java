
public class RadioVolumn {
	public SingletonRadio singletonRadio;
	public RadioVolumn(SingletonRadio singletonRadio) {
		this.singletonRadio = singletonRadio;
	}
	public void TurnOn() {
		System.out.println("Turn on radio : '" + singletonRadio.getName() +"' with voulmn at " + singletonRadio.getVolumn());
	}
	public void TurnUp(int upAmount) {
		System.out.println("Turn Up radio : '" + singletonRadio.getName() + "' volumn to "+ (singletonRadio.getVolumn()+upAmount));
		singletonRadio.setVolumn((singletonRadio.getVolumn()+upAmount));
	}
}

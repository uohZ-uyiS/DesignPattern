
public class SingletonRadio {
	private static SingletonRadio obj;
	private String radioName;
	private int volumn;
	// private constructor to force use of
	SingletonRadio(String radioName, int volumn) {
		//use getInstance function to create objects
		this.radioName = radioName;
		this.volumn = volumn;
	}
	public String getName() {
		return radioName;
	}
	public int getVolumn() {
		return volumn;
	}
	public int setVolumn(int volumn) {
		return this.volumn = volumn;
	}
	public void printVolumn() {
		System.out.println("Current Volumn is :" + volumn);
	}
	public static SingletonRadio getInstance(String radioName, int volumn) {
		if(obj == null) {
			//guarantee only one thread will be able to execute in anyone of
			//instance at a time, and all other instances will be locked for other thread
			synchronized (SingletonRadio.class) {
				if(obj == null) {
					obj = new SingletonRadio(radioName, volumn);
					System.out.println("I am new radio '"+ obj.getName()+"'!");
				}else
					System.out.println("Radio exist\n");
			}
		}else 
			System.out.println("Radio exist\n");	
		return obj;
	}
}

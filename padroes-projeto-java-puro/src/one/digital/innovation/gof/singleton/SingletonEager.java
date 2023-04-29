package one.digital.innovation.gof.singleton;

public class SingletonEager {

	private static SingletonEager inst = new SingletonEager();
	
	private SingletonEager(){
		super();
	}
	
	
	public static SingletonEager getInst() {
		return inst;
	}
}

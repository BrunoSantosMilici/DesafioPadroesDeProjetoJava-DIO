package one.digital.innovation.gof.singleton;

public class SingletonLazy {

	private static SingletonLazy inst;
	
	private SingletonLazy() {
		super();
	}
	
	
	
	public static SingletonLazy getInst() {
		if (inst == null) {
			inst = new SingletonLazy();
		}
		return inst;
	}
}

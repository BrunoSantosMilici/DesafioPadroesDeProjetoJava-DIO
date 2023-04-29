package one.digital.innovation.gof.singleton;

public class SingletonLazyHolder {

	
	public static class InstHolder{
	private static SingletonLazyHolder inst = new SingletonLazyHolder();
	}
	private SingletonLazyHolder(){
		super();
	}
	
	
	public static SingletonLazyHolder getInst() {
		return InstHolder.inst;
	}
}

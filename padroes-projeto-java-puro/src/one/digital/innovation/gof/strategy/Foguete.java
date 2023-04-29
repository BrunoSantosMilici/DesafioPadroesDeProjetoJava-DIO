package one.digital.innovation.gof.strategy;

public class Foguete {

	private Comandos strategy;

	public void setStrategy(Comandos strategy) {
		this.strategy = strategy;
	}
	
	public void mover() {
		strategy.mover();
	}
	
}

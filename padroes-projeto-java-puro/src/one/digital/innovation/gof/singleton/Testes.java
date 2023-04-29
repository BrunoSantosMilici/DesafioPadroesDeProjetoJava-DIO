package one.digital.innovation.gof.singleton;

import one.digital.innovation.gof.facade.Facade;
import one.digital.innovation.gof.strategy.Comandos;
import one.digital.innovation.gof.strategy.ComandosAcelerados;
import one.digital.innovation.gof.strategy.ComandosNormais;
import one.digital.innovation.gof.strategy.ComandosOrbitais;
import one.digital.innovation.gof.strategy.Foguete;

public class Testes {
//singleton
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInst();
		System.out.println(lazy);
		lazy = SingletonLazy.getInst();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInst();
		System.out.println(eager);
		eager = SingletonEager.getInst();
		System.out.println(eager);
	
		SingletonLazyHolder holder = SingletonLazyHolder.getInst();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInst();
		System.out.println(holder);
		
		//strategy
		Comandos normal = new ComandosNormais();
		Comandos acelerado = new ComandosAcelerados();
		Comandos orbitais = new ComandosOrbitais();
		
		Foguete foguete = new Foguete();
		 
		foguete.setStrategy(normal);
		
		foguete.mover();
		
		foguete.setStrategy(acelerado);
		
		foguete.mover();
		foguete.mover();
		
		foguete.setStrategy(orbitais);
		foguete.mover();
		
		
		//Facade
		Facade facade = new Facade();
		facade.migrarCliente("Bruno","1234567");
		
		
	}
	
	
}

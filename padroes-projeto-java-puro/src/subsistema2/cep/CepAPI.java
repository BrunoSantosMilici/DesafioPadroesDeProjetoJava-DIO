package subsistema2.cep;

public class CepAPI {

private static CepAPI inst = new CepAPI();
	
	private CepAPI(){
		super();
	}
	
	
	public static CepAPI getInst() {
		return inst;
	}
	
	public String recuperarCidade(String cep) {
		return "Jundiaí";
	}
	
	public String recuperarEstado(String estado) {
		return "SP";
	}
	
}

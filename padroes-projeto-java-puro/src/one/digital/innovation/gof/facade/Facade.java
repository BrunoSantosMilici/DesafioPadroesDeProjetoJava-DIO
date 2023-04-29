package one.digital.innovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepAPI;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepAPI.getInst().recuperarCidade(cep);
		String estado = CepAPI.getInst().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
	
}

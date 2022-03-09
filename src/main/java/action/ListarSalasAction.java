package action;

import entity.Sala;
import service.SalaService;

import java.util.List;



public class ListarSalasAction extends Action {

	@Override
	public void process() throws Exception {
		
		SalaService salaService = serviceFactory.getSalaService();
		List<Sala> salas = salaService.getSalas();
		
		getRequest().setAttribute("salas", salas);
		forward("lista_salas.jsp");
	}
}

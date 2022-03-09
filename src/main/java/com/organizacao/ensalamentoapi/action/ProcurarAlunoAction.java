package com.organizacao.ensalamentoapi.action;

import com.organizacao.ensalamentoapi.entity.Aluno;
import com.organizacao.ensalamentoapi.service.AlunoService;

import java.util.List;


public class ProcurarAlunoAction extends Action {

	@Override
	public void process() throws Exception {
		
		String nome = getRequest().getParameter("nome");
		String numSala = getRequest().getParameter("numSala");
		
		getRequest().setAttribute("numSala", numSala);
		
		if (nome != null) {
			AlunoService alunoService = serviceFactory.getAlunoService();
			List<Aluno> alunos = alunoService.getAlunosByNome(nome);
			getRequest().setAttribute("alunos", alunos);
		}
		
		forward("procurar_alunos.jsp");
	}
}

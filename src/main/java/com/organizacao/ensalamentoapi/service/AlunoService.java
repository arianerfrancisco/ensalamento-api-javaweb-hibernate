package com.organizacao.ensalamentoapi.service;

import com.organizacao.ensalamentoapi.dao.AlunoDAO;
import com.organizacao.ensalamentoapi.dao.DAOException;
import com.organizacao.ensalamentoapi.entity.Aluno;

import java.util.List;

public class AlunoService extends Service {

    public List<Aluno> getAlunosByNome(String nome) throws ServiceException {
        try {
            AlunoDAO alunoDAO = daoFactory.getAlunoDAO();
            List<Aluno> alunos = alunoDAO.getAlunosNaoEnsaladosByNome(nome);
            return alunos;

        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}

package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class AlunoBO {

	AlunoDAO alunoDAO;

	public void inserirBo(Aluno aluno) throws ClassNotFoundException, SQLException {
		alunoDAO = new AlunoDAO();

		// REGRAS DE NEGOCIOS

		alunoDAO.inserir(aluno);
	}

	public void atualizarBo(Aluno aluno) throws ClassNotFoundException, SQLException {
		alunoDAO = new AlunoDAO();

		alunoDAO.atualizar(aluno);
	}

	public void deletarBo(int rm) throws ClassNotFoundException, SQLException {
		alunoDAO = new AlunoDAO();

		alunoDAO.deletar(rm);

	}

	public List<Aluno> selecionarBo() throws ClassNotFoundException, SQLException {
		alunoDAO = new AlunoDAO();

		return (ArrayList<Aluno>) alunoDAO.selecionar();
	}

}

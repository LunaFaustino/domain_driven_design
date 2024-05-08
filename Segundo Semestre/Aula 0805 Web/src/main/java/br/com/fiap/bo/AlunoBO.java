package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class AlunoBO {
	
	AlunoDAO alunoDao;
	
	public void inserirBo (Aluno aluno) throws SQLException, ClassNotFoundException {
		alunoDao = new AlunoDAO();
		
		alunoDao.inserir(aluno);
		
	}
	
	public void atualizarBo (Aluno aluno) throws ClassNotFoundException, SQLException {
		alunoDao = new AlunoDAO();
		
		alunoDao.atualizar(aluno);
	}
	
	public void deletarBo (int rm) throws ClassNotFoundException, SQLException {
		alunoDao = new AlunoDAO();
		
		alunoDao.deletar(rm);
		
	}
	
	public List<Aluno> selecionarBo() throws ClassNotFoundException, SQLException {
		alunoDao = new AlunoDAO();
		
		return (ArrayList<Aluno>) alunoDao.selecionar();
	}

}

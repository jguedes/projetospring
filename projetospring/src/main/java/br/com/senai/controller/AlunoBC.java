package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senai.model.endereco.Endereco;
import br.com.senai.model.pessoa.aluno.Aluno;
import br.com.senai.model.repository.IAlunoDAO;
import br.com.senai.model.repository.IEnderecoDAO;

@Controller
public class AlunoBC {

	@Autowired
	private IAlunoDAO dao;

	@Autowired
	private IEnderecoDAO daoEndereco;

	public void salvarAluno(Aluno aluno) {

		List<Endereco> enderecos = null;

		if (aluno.getEnderecos() != null && aluno.getEnderecos().size() > 0) {

			enderecos = aluno.getEnderecos();

		}

		aluno = dao.save(aluno);

		if (enderecos != null && enderecos.size() > 0) {

			for (Endereco endereco : enderecos) {

				endereco.setPessoa(aluno);

				daoEndereco.save(endereco);

			}

		}
	}

	public void excluirAluno(Aluno aluno) {
		dao.delete(aluno);
	}

	public List<Aluno> listarAluno() {
		return dao.findAll();
	}

	public long getNewMatricula() {
		// TODO Auto-generated method stub
		return 10000 + dao.count();
	}

}

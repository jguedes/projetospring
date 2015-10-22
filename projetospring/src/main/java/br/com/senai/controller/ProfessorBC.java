package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senai.model.endereco.Endereco;
import br.com.senai.model.pessoa.professor.Professor;
import br.com.senai.model.repository.IEnderecoDAO;
import br.com.senai.model.repository.IProfessorDAO;
import br.com.senai.model.repository.ITelefoneDAO;
import br.com.senai.model.telefone.Telefone;

@Controller
public class ProfessorBC {

	@Autowired
	private IProfessorDAO dao;

	@Autowired
	private IEnderecoDAO daoEndereco;

	@Autowired
	private ITelefoneDAO telefoneDAO;

	public void salvarProfessor(Professor professor) {

		List<Endereco> enderecos = null;
		List<Telefone> telefones = null;

		if (professor.getEnderecos() != null && professor.getEnderecos().size() > 0) {

			enderecos = professor.getEnderecos();

		}

		if (professor.getTelefones() != null && professor.getTelefones().size() > 0) {

			telefones = professor.getTelefones();

		}

		professor = dao.save(professor);

		if (enderecos != null && enderecos.size() > 0) {

			for (Endereco endereco : enderecos) {

				endereco.setPessoa(professor);

				daoEndereco.save(endereco);

			}

		}

		if (telefones != null && telefones.size() > 0) {

			for (Telefone telefone : telefones) {

				telefone.setPessoa(professor);

				telefoneDAO.save(telefone);

			}

		}

	}

	public void excluirProfessor(Professor professor) {
		dao.delete(professor);
	}

	public List<Professor> listarProfessor() {
		return dao.findAll();
	}

}

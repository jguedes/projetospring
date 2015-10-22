package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senai.model.pessoa.Pessoa;
import br.com.senai.model.repository.ITelefoneDAO;
import br.com.senai.model.telefone.Telefone;

@Controller
public class TelefoneBC {

	@Autowired
	private ITelefoneDAO dao;

	public void salvarTelefone(Telefone telefone) {
		dao.save(telefone);
	}

	public void excluirTelefone(Telefone telefone) {
		dao.delete(telefone);
	}

	public List<Telefone> listarTelefone() {
		return dao.findAll();
	}

	public List<Telefone> getTelefoneByPessoa(Pessoa pessoa) {
		return dao.findByPessoa(pessoa);
	}

}

package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senai.model.publicacao.Publicacao;
import br.com.senai.model.repository.IPublicacaoDAO;

@Controller
public class PublicacaoBC {

	@Autowired
	private IPublicacaoDAO dao;

	public void salvarPublicacao(Publicacao publicacao) {
		dao.save(publicacao);
	}

	public void excluirPublicacao(Publicacao publicacao) {
		dao.delete(publicacao);
	}

	public List<Publicacao> listarPublicacao() {
		return dao.findAll();
	}

}

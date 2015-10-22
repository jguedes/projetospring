package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senai.model.meiocomunicacao.MeioComunicacao;
import br.com.senai.model.repository.IMeioComunicacaoDAO;

@Controller
public class MeioComunicacaoBC {

	@Autowired
	private IMeioComunicacaoDAO dao;

	public void salvarMeioComunicacao(MeioComunicacao meioComunicacao) {
		dao.save(meioComunicacao);
	}

	public void excluirMeioComunicacao(MeioComunicacao meioComunicacao) {
		dao.delete(meioComunicacao);
	}

	public List<MeioComunicacao> listarMeioComunicacao() {
		return dao.findAll();
	}

}

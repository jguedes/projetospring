package br.com.senai.view;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.meiocomunicacao.MeioComunicacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "meioComunicacaoEditMB")
public class MeioComunicacaoEditMB {

	@Autowired
	private Fachada fachada;

	private MeioComunicacao meioComunicacao;

	@PostConstruct
	private void init() {
		meioComunicacao = new MeioComunicacao();
	}

	public void preAlterar(MeioComunicacao meioComunicacao) {
		setMeioComunicacao(meioComunicacao);
	}

	public String salvar() {
		fachada.salvarMeioComunicacao(meioComunicacao);
		return "success";
	}

	public MeioComunicacao getMeioComunicacao() {
		return meioComunicacao;
	}

	public void setMeioComunicacao(MeioComunicacao meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}

}

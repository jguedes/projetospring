package br.com.senai.view;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.titulacao.Titulacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "titulacaoEditMB")
public class TitulacaoEditMB {

	@Autowired
	private Fachada fachada;

	private Titulacao titulacao;

	@PostConstruct
	private void init() {
		titulacao = new Titulacao();
	}

	public void preAlterar(Titulacao titulacao) {
		setTitulacao(titulacao);
	}

	public String salvar() {
		fachada.salvarTitulacao(titulacao);
		return "success";
	}

	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}

}

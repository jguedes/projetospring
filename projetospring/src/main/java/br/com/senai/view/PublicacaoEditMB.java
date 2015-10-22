package br.com.senai.view;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.publicacao.Publicacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "publicacaoEditMB")
public class PublicacaoEditMB {

	@Autowired
	private Fachada fachada;

	private Publicacao publicacao;

	@PostConstruct
	private void init() {
		publicacao = new Publicacao();
	}

	public void preAlterar(Publicacao publicacao) {
		setPublicacao(publicacao);
	}

	public String salvar() {
		fachada.salvarPublicacao(publicacao);
		return "success";
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

}

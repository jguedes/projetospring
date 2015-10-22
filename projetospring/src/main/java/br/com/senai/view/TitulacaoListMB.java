package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.titulacao.Titulacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "titulacaoListMB")
public class TitulacaoListMB {

	@Inject
	private Fachada fachada;

	private List<Titulacao> listaTitulacao;

	@PostConstruct
	private void init() {
		setListaTitulacao(listarTitulacao());
	}

	private List<Titulacao> listarTitulacao() {
		return fachada.listarTitulacao();
	}

	public void excluir(Titulacao titulacao) {
		fachada.excluirTitulacao(titulacao);
		setListaTitulacao(listarTitulacao());
	}

	public List<Titulacao> getListaTitulacao() {
		return listaTitulacao;
	}

	public void setListaTitulacao(List<Titulacao> listaTitulacao) {
		this.listaTitulacao = listaTitulacao;
	}

}

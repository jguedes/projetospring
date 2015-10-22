package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.publicacao.Publicacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "publicacaoListMB")
public class PublicacaoListMB {

	@Inject
	private Fachada fachada;

	private List<Publicacao> listaPublicacao;

	@PostConstruct
	private void init() {
		setListaPublicacao(listarPublicacao());
	}

	private List<Publicacao> listarPublicacao() {
		return fachada.listarPublicacao();
	}

	public void excluir(Publicacao publicacao) {
		fachada.excluirPublicacao(publicacao);
		setListaPublicacao(listarPublicacao());
	}

	public List<Publicacao> getListaPublicacao() {
		return listaPublicacao;
	}

	public void setListaPublicacao(List<Publicacao> listaPublicacao) {
		this.listaPublicacao = listaPublicacao;
	}

}

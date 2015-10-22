package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.meiocomunicacao.MeioComunicacao;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "meioComunicacaoListMB")
public class MeioComunicacaoListMB {

	@Inject
	private Fachada fachada;

	private List<MeioComunicacao> listaMeioComunicacao;

	@PostConstruct
	private void init() {
		setListaMeioComunicacao(listarMeioComunicacao());
	}

	private List<MeioComunicacao> listarMeioComunicacao() {
		return fachada.listarMeioComunicacao();
	}

	public void excluir(MeioComunicacao meioComunicacao) {
		fachada.excluirMeioComunicacao(meioComunicacao);
		setListaMeioComunicacao(listarMeioComunicacao());
	}

	public List<MeioComunicacao> getListaMeioComunicacao() {
		return listaMeioComunicacao;
	}

	public void setListaMeioComunicacao(List<MeioComunicacao> listaMeioComunicacao) {
		this.listaMeioComunicacao = listaMeioComunicacao;
	}

}

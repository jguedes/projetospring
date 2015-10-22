package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.pessoa.aluno.Aluno;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "alunoListMB")
public class AlunoListMB {

	@Inject
	private Fachada fachada;

	private List<Aluno> listaAluno;

	@PostConstruct
	private void init() {
		setListaAluno(listarAluno());
	}

	private List<Aluno> listarAluno() {
		return fachada.listarAluno();
	}

	public void excluir(Aluno aluno) {
		fachada.excluirAluno(aluno);
		setListaAluno(listarAluno());
	}

	public List<Aluno> getListaAluno() {
		return listaAluno;
	}

	public void setListaAluno(List<Aluno> listaAluno) {
		this.listaAluno = listaAluno;
	}

}

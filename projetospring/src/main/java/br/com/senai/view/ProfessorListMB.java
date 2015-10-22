package br.com.senai.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.senai.model.pessoa.professor.Professor;
import br.com.senai.support.Fachada;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "professorListMB")
public class ProfessorListMB {

	@Inject
	private Fachada fachada;

	private List<Professor> listaProfessor;

	@PostConstruct
	private void init() {
		setListaProfessor(listarProfessor());
	}

	private List<Professor> listarProfessor() {
		return fachada.listarProfessor();
	}

	public void excluir(Professor professor) {
		fachada.excluirProfessor(professor);
		setListaProfessor(listarProfessor());
	}

	public List<Professor> getListaProfessor() {
		return listaProfessor;
	}

	public void setListaProfessor(List<Professor> listaProfessor) {
		this.listaProfessor = listaProfessor;
	}

}

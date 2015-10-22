package br.com.senai.model.pessoa.aluno;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.senai.model.pessoa.Pessoa;
import br.com.senai.model.pessoa.TipoPessoa;
import br.com.senai.model.pessoa.professor.Professor;
import br.com.senai.model.publicacao.Publicacao;

@Entity
@Table(name = "aluno")
public class Aluno extends Pessoa {

	private static final long serialVersionUID = 1L;

	@Column(name = "matricula", nullable = true)
	private long matricula;

	@ManyToOne
	private Professor professor;

	@OneToMany
	private List<Publicacao> publicacoes;

	public Aluno() {
		super(TipoPessoa.ALUNO);
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}

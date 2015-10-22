package br.com.senai.model.publicacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.senai.model.EntidadeBase;
import br.com.senai.model.meiocomunicacao.MeioComunicacao;
import br.com.senai.model.pessoa.aluno.Aluno;
import br.com.senai.model.pessoa.professor.Professor;

@Entity
@Table(name = "publicacao")
public class Publicacao extends EntidadeBase<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "titulo", length = 100, nullable = false)
	private String titulo;

	@Column(name = "descricao", length = 500, nullable = false)
	private String descricao;

	@OneToOne
	private Aluno aluno;

	@OneToOne
	private Professor professor;

	@OneToOne
	private MeioComunicacao meioComunicacao;

	public MeioComunicacao getMeioComunicacao() {
		return meioComunicacao;
	}

	public void setMeioComunicacao(MeioComunicacao meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}

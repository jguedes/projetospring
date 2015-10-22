package br.com.senai.model.pessoa.professor;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.senai.model.pessoa.Pessoa;
import br.com.senai.model.pessoa.TipoPessoa;
import br.com.senai.model.publicacao.Publicacao;
import br.com.senai.model.titulacao.Titulacao;

@Entity
@Table(name = "professor")
public class Professor extends Pessoa {

	private static final long serialVersionUID = 1L;

	@Column(name = "iensino", length = 100, nullable = true)
	private String iensino;

	@Column(name = "departamento", length = 30, nullable = true)
	private String departamento;

	@Temporal(TemporalType.DATE)
	private Date dtAdmissao;

	@OneToOne
	private Titulacao titulacao;

	@OneToMany
	private List<Publicacao> publicacoes;

	public Professor() {
		super(TipoPessoa.PROFESSOR);
	}

	public String getIensino() {
		return iensino;
	}

	public void setIensino(String iensino) {
		this.iensino = iensino;
	}

	public Date getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(Date dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}

package br.com.senai.model.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.senai.model.EntidadeBase;
import br.com.senai.model.pessoa.Pessoa;

@Entity
@Table(name = "endereco")
public class Endereco extends EntidadeBase<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "logradouro", length = 200, nullable = false)
	private String logradouro;

	@Column(name = "bairro", length = 30, nullable = false)
	private String bairro;

	@Column(name = "numero", nullable = false)
	private int numero;

	@Enumerated(EnumType.ORDINAL)
	private Cidade cidade;

	@Column(name = "uf", length = 30, nullable = false)
	private String uf = "Pernambuco";

	@OneToOne
	private Pessoa pessoa;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}

package br.com.senai.model.telefone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.senai.model.EntidadeBase;
import br.com.senai.model.pessoa.Pessoa;

@Entity
@Table(name = "telefone")
public class Telefone extends EntidadeBase<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "ddd", nullable = false, length = 3)
	private int ddd;

	@Column(name = "numero", nullable = false, length = 10)
	private int numero;

	@OneToOne
	private Pessoa pessoa;

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}

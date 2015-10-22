package br.com.senai.model.titulacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.senai.model.EntidadeBase;

@Entity
@Table(name = "titulacao")
public class Titulacao extends EntidadeBase<Long> {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 50)
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {

		return this.titulo;

	}

}

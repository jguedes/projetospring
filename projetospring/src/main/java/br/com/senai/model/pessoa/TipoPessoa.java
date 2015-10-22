package br.com.senai.model.pessoa;

public enum TipoPessoa {
	ALUNO(1), PROFESSOR(2);
	private int valor;

	private TipoPessoa(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}

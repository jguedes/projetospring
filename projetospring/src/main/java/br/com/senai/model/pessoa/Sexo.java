package br.com.senai.model.pessoa;

public enum Sexo {
	MASCULINO(1), FEMININO(2), OUTROS(3);

	private int valor;

	private Sexo(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}

}

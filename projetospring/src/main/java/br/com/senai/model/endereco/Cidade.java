package br.com.senai.model.endereco;

public enum Cidade {
	RECIFE(1), JABOATAO(2), CAMARAGIBE(3), OLINDA(4), MORENO(5), CARPINA(6), CARUARU(7), SAO_LOURENCO(8), ALDEIA(
			9), ITAMARACA(10);
	private int valor;

	private Cidade(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}

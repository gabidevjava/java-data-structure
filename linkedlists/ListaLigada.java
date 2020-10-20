package linkedlists;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeira);
		this.primeira = nova;

		if (this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}

		this.totalDeElementos++;
	}

	public void adicionaNoFinal(Object elemento) {

		if (this.totalDeElementos == 0) {
			adicionaNoFinal(elemento);
		} else {
			Celula nova = new Celula(elemento, null);

			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}

	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	public Celula pegaCelula(int posicao) {

		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inexistente");
		}

		Celula atual = primeira;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}

		return atual;
	}

	public void adicionaNoMeio(int posicao, Object elemento) {

		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			adicionaNoFinal(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula(elemento, anterior.getProximo());

			anterior.setProximo(nova);

			this.totalDeElementos++;
		}

	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco() {

		if (this.totalDeElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		}
		
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}

	public void remove(int posicao) {}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		return false;
	}

	@Override
	public String toString() {

		if (this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = primeira;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");

			atual = atual.getProximo();
		}

		builder.append("]");
		return builder.toString();
	}
}
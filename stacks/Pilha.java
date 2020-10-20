package stacks;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<String> nomes = new LinkedList<String>();
	
	public void push(String nome) {
		nomes.add(nome);
	}
	
	public String pop() {
		return nomes.remove(nomes.size()-1);
	}
	
	public boolean vazia() {
		return nomes.isEmpty();
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}

}

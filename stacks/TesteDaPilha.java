package stacks;

import java.util.Stack;

public class TesteDaPilha {
	
	public static void main(String[] args) {
		
//		Pilha pilha = new Pilha();
//		
//		pilha.push("Gabriela Guedes");
//		
//		System.out.println(pilha);
//		
//		pilha.push("Palmeiras FC");
//		
//		System.out.println(pilha);
//		
//		String r1 = pilha.pop();
//		
//		System.out.println(r1);
//		
//		String r2 = pilha.pop();
//		
//		System.out.println(r2);
//		
//		System.out.println(pilha);
		
		Stack<String> stack = new Stack<String>();
		stack.push("Mauricio");
		stack.push("Marcelo");
		
		System.out.println(stack);
		
		stack.pop();
		
		stack.push("Guilherme");
		stack.push("Paulo");
		
		stack.pop();
		
		stack.push("João");
		
//		String nome = stack.peek();
		
//		System.out.println("indicao da lista " + nome);
		
		System.out.println(stack);
		
	}
}

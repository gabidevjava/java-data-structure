package sequentialstorageandvectors;

public class VetorTeste {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gabi");
		Aluno a2 = new Aluno("Cauan");
		
		Vetor vetor = new Vetor();
		
		System.out.println(vetor.tamanho());
		vetor.adiciona(a1);
		System.out.println(vetor.tamanho());
		vetor.adiciona(a2);
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor);
	}
}

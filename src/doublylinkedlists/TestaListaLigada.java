package doublylinkedlists;

public class TestaListaLigada {
	
	public static void main(String[] args) {
		ListaDuplamenteLigada listaLigada = new ListaDuplamenteLigada();
			
		System.out.println(listaLigada);
		listaLigada.adicionaNoComeco("Gaby");
		System.out.println(listaLigada);
		listaLigada.adicionaNoComeco("Jeff");
		System.out.println(listaLigada);
		listaLigada.adicionaNoComeco("Breno");
		System.out.println(listaLigada);
		
		
		listaLigada.adicionaNoFinal("André");
		System.out.println(listaLigada);
		
		listaLigada.adicionaNoMeio(2, "Jureba");
		System.out.println(listaLigada);
	}
}

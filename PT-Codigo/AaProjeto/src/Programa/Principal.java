package Programa;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				ListaDupla teste = new ListaDupla();
		
		teste.inserirFim(new CadastroAutoPeca( "lip",28));
		teste.inserirFim(new CadastroAutoPeca( "Janio",20));
		teste.inserirFim(new CadastroAutoPeca( "Marcos",21));
		teste.inserirFim(new CadastroAutoPeca( "Rosa",22));
		teste.inserirComeco(new CadastroAutoPeca( "nina",27));
		
	
		
		teste.exibirLista();
		
		//teste.RemoverFim();
		
		teste.exibirLista();


	}

}

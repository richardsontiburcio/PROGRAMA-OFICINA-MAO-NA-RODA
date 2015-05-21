package Programa;

public class CadastroAutoPeca {


	
	
		public CadastroAutoPeca(int idade, String nome) {
		
		setNome(nome);
		setIdade(idade);
		setProx(null);
		setAnt(null);
	}
		

		public CadastroAutoPeca(String nome, int idade) {
		
		setNome(nome);
		setIdade(idade);
		setProx(null);
		setAnt(null);
	}
		
		
		private String nome;
		private int idade;
		private CadastroAutoPeca prox;
		private CadastroAutoPeca ant;
		
		
		
		public CadastroAutoPeca getProx() {
			return prox;
		}
		public void setProx(CadastroAutoPeca prox) {
			this.prox = prox;
		}
		public CadastroAutoPeca getAnt() {
			return ant;
		}
		public void setAnt(CadastroAutoPeca ant) {
			this.ant = ant;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		
		
		


}

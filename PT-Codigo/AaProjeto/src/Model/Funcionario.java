package Model;

public class Funcionario extends Cliente {

	public Funcionario(){
		
		super();
		
	}
	
	public Funcionario(String nome, int idade, Endereco endereco, Telefone telefone){
		
		super(nome,idade,endereco,telefone,null);
		
	}

	
	public String toString() {
		return "Funcionario \nNome =" + getNome() + "\nIdade ="
				+ getIdade() + "\nEndereco =" + getEndereco()
				+ "\nTelefone =" + getTelefone();
	}
	
}

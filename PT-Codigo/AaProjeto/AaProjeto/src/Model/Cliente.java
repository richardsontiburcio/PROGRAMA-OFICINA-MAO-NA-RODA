package Model;

import javax.swing.JOptionPane;

public class Cliente {
	
	private String nome;
	private int idade;
	private Endereco endereco;
	private Telefone telefone;
	private Carro carro;
	
	public Cliente(){
		
		setNome(null);
		setIdade(0);
		setEndereco(null);
		setTelefone(null);
		setCarro(null);

	}
	
	public Cliente(String nome, int idade, Endereco endereco, Telefone telefone, Carro carro){
		
		setNome(nome);
		setIdade(idade);
		setEndereco(endereco);
		setTelefone(telefone);
		setCarro(carro);
		
	}
	
	public String getNome() {
	
		return nome;
	
	}
	
	public void setNome(String nome) {
		if(nome.equals("")||nome.equals(" ")){
			JOptionPane.showMessageDialog(null, "Digite o Nome corretamente");
		}else {
	
		this.nome = nome;
		}
	}
	
	public int getIdade() {
	
		return idade;
	
	}
	
	public void setIdade(int idade) {
	
		this.idade = idade;
	
	}
	
	public Endereco getEndereco() {
	
		return endereco;
	
	}
	
	public void setEndereco(Endereco endereco) {
		if(nome.equals("")||nome.equals(" ")){
			JOptionPane.showMessageDialog(null, "Digite o Nome corretamente");
		}else {
	
		this.endereco = endereco;
		}
	}
	
	public Telefone getTelefone() {
	
		return telefone;
	
	}
	
	public void setTelefone(Telefone telefone) {
	
		this.telefone = telefone;
	
	}

	public Carro getCarro() {
	
		return carro;
	
	}

	public void setCarro(Carro carro) {
		if(nome.equals("")||nome.equals(" ")){
			JOptionPane.showMessageDialog(null, "Digite o Nome corretamente");
		}else {
	
		this.carro = carro;
		}
	}


	public String toString() {
		return "Cliente \nnome=" + nome + "\nidade=" + idade + "\nendereco="
				+ endereco + "\ntelefone=" + telefone + "\n carro=" + carro;
	}
	
	

}

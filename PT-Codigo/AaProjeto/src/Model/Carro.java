package Model;

public class Carro {
	
	private String marca,modelo, problema;
	private Carro carro;
	
	public Carro(){
		
		setMarca("");
		setModelo("");
		setProblema("");
		
	}
	
	public Carro(String marca, String modelo, String problema){
		
		setMarca(marca);
		setModelo(modelo);
		setProblema(problema);
		
	}
	
	//public Carro getCarro(){
		
		//if(this.carro == null){
			
			//this.carro = new Carro();
			//return carro;
		//}else{
			
			//return carro;
			
		//}
		
	//}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	
	public String toString() {
		return "Carro marca=" + marca + ", modelo=" + modelo + ", problema="
				+ problema;
	}

	//public void inserir(String marca, String modelo, String problema){
		
	//	setMarca(marca);
	//	setModelo(modelo);
	//	setProblema(problema);
		
	//}
	
}

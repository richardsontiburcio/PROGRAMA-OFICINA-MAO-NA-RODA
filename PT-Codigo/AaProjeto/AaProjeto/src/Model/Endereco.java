package Model;

public class Endereco {

	private String rua, bairro, num, cidade, cep;
	
	public Endereco(){
		
		setRua(null);
		setBairro(null);
		setNum(null);
		setCidade(null);
		setCep(null);
		
	}
	
	public Endereco(String rua, String bairro, String num, String cidade, String cep){
		
		setRua(rua);
		setBairro(bairro);
		setNum(num);
		setCidade(cidade);
		setCep(cep);
		
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	
	public String toString() {
		return "Endereco = " + rua + ", " + bairro + ", " + num
				+ ", " + cidade + ", " + cep;
	} 
	
}

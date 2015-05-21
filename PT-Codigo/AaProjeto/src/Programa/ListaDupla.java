package Programa;




public class ListaDupla {

	public ListaDupla(){
		setPrimeiro(null);
		setUltimo(null);
		
	}
	

	private CadastroAutoPeca primeiro;
	private CadastroAutoPeca ultimo;
	private int contador = 0;
	
	public void inserirComeco(CadastroAutoPeca NovoNo){
		if(isListaVazia()){
			setPrimeiro(NovoNo);
			setUltimo(NovoNo);
		} else{
			
			getPrimeiro().setAnt(NovoNo);
			NovoNo.setProx(getPrimeiro());
			setPrimeiro(NovoNo);

		}
		this.contador++;
		
	}
	
	public void inserirFim(CadastroAutoPeca NovoNo){
		if(isListaVazia()){
			setPrimeiro(NovoNo);
			setUltimo(NovoNo);
		} else{
			
			getUltimo().setAnt(NovoNo);
			NovoNo.setProx(getUltimo());
			setUltimo(NovoNo);

		}
		this.contador++;
		
	}
	
	public void RemoverComeco(){
			
		if(isListaVazia()){
			System.out.println("Lista Vazia");
		}
		
		CadastroAutoPeca aux = getPrimeiro();
		if (getPrimeiro().getProx() != null){
			setPrimeiro(getPrimeiro().getProx());
			getPrimeiro().getAnt().setProx(null);
			getPrimeiro().setAnt(null);
			
		}else{
			setPrimeiro(null);
			setUltimo(null);
		}
		this.contador--;
		
	}
	
	public void RemoverFim(){
		
		if(isListaVazia()){
			System.out.println("Lista Vazia");
		}
		
		CadastroAutoPeca aux = getUltimo();
		if (getUltimo().getProx() != null){
			setUltimo(getUltimo().getProx());
			getUltimo().getAnt().setProx(null);
			getUltimo().setAnt(null);
			
		}else{
			setPrimeiro(null);
			setUltimo(null);
		}
		this.contador--;
		
	}
	
	
	public void exibirLista(){
		
		CadastroAutoPeca temp=getPrimeiro();
		int cont = 0;
		
		while(cont<contador || temp.getProx()==null){
		System.out.println("Nome "+temp.getNome()+ " Idade "+temp.getIdade());
		temp=temp.getProx();
		
//		getPrimeiro().setAnt(temp);
//		temp=temp.getProx();
	
		cont++;
		}
	}
	
	public boolean isListaVazia(){
		if(getPrimeiro()==null && getUltimo()==null){
			return true;
		} else{
			return false;
		}
		
	}
	
	  public CadastroAutoPeca getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(CadastroAutoPeca primeiro) {
		this.primeiro = primeiro;
	}
	public CadastroAutoPeca getUltimo() {
		return ultimo;
	}
	public void setUltimo(CadastroAutoPeca ultimo) {
		this.ultimo = ultimo;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}

	

}

package Controller;



public class ListaDupla {

	private NoDuplo primeiro, ultimo, temp;
	private int numNo;

	public ListaDupla(){

		setPrimeiro(null);
		setUltimo(null);

	}

	public ListaDupla(NoDuplo primeiro, NoDuplo ultimo){

		setPrimeiro(primeiro);
		setUltimo(ultimo);

	}

	public int getNumNo() {
	
		return numNo;
	
	}

	public void setNumNo(int numNo) {
		
		this.numNo += numNo;
	
	}

	public NoDuplo getPrimeiro() {
	
		return primeiro;
	
	}

	public void setPrimeiro(NoDuplo primeiro) {
	
		this.primeiro = primeiro;
	
	}

	public NoDuplo getUltimo() {
	
		return ultimo;
	
	}

	public void setUltimo(NoDuplo ultimo) {
	
		this.ultimo = ultimo;
	
	}

	public NoDuplo getTemp() {
		
		return temp;
	
	}

	public void setTemp(NoDuplo temp) {
		
		this.temp = temp;
	
	}

	public boolean isListaVazia(){

		if (getPrimeiro() == null && getUltimo() == null){

			return true;

		}else{

			return false;

		}

	}

	public void inserirNoInicio(NoDuplo novoNo){

		if(isListaVazia()){

			setPrimeiro(novoNo);
			setUltimo(novoNo);
			setNumNo(1);

		}else{

			novoNo.setProx(getPrimeiro());
			getPrimeiro().setAnt(novoNo);
			setPrimeiro(novoNo);

			

				setNumNo(1);

			

		}

	}

	public void exibirLista(){


		setTemp(getPrimeiro());

		while(getTemp() != null){

			System.out.println(getTemp().getCliente().toString() + "\n" + getNumNo());

			getPrimeiro().setAnt(getTemp());
			setTemp(getTemp().getProx());


		}

	}

	public void inserirNoFim(NoDuplo novoNo){

		if(isListaVazia()){

			setPrimeiro(novoNo);
			setUltimo(novoNo);

			setNumNo(1);

		}else{

			novoNo.setAnt(getUltimo());
			getUltimo().setProx(novoNo);
			setUltimo(novoNo);

			

				setNumNo(1);

			
		}
	}

	public void excluirNoInicio(){

		if (isListaVazia()){		

			System.out.println("Lista vazia");

		}else{


			setPrimeiro(getPrimeiro().getProx()); 
			getPrimeiro().setAnt(null);

			setNumNo(-1);
			
		}
	}
	
	public void excluirNoFim(){
		
		if (isListaVazia()){		

			System.out.println("Lista vazia");

		}else{


			setUltimo(getUltimo().getAnt());
			getUltimo().setProx(null);

			setNumNo(-1);
			
		}
	}
}

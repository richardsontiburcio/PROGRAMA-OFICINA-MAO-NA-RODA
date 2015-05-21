package Controller;



public class FilaCarros {

	private NoDuploFila primeiro, ultimo, temp;
	private int numNo;


	public FilaCarros(){

		setPrimeiro(null);
		setUltimo(null);

	}

	public FilaCarros(NoDuploFila primeiro, NoDuploFila ultimo){

		setPrimeiro(primeiro);
		setUltimo(ultimo);

	}

	public int getNumNo() {
		return numNo;
	}

	public void setNumNo(int numNo) {
		this.numNo += numNo;
	}

	public NoDuploFila getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoDuploFila primeiro) {
		this.primeiro = primeiro;
	}

	public NoDuploFila getUltimo() {
		return ultimo;
	}

	public void setUltimo(NoDuploFila ultimo) {
		this.ultimo = ultimo;
	}

	public NoDuploFila getTemp() {
		return temp;
	}

	public void setTemp(NoDuploFila temp) {
		this.temp = temp;
	}

	public boolean isListaVazia(){

		if (getPrimeiro() == null && getUltimo() == null){

			return true;

		}else{

			return false;

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

	public void enfileirar(NoDuploFila novoNo){

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

	public void desenfileirar(){

		if (isListaVazia()){		

			System.out.println("Lista vazia");

		}else{


			setPrimeiro(getPrimeiro().getProx()); 
			getPrimeiro().setAnt(null);

			setNumNo(-1);

		}
	}	

}







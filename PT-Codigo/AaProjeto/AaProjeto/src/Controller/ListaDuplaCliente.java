package Controller;

import javax.swing.JOptionPane;

import Model.Cliente;



public class ListaDuplaCliente {

	private NoDuploCliente primeiro, ultimo, temp;
	private int numNo;

	public ListaDuplaCliente(){

		setPrimeiro(null);
		setUltimo(null);

	}

	public ListaDuplaCliente(NoDuploCliente primeiro, NoDuploCliente ultimo){

		setPrimeiro(primeiro);
		setUltimo(ultimo);

	}

	public int getNumNo() {

		return numNo;

	}

	public void setNumNo(int numNo) {

		this.numNo += numNo;

	}

	public NoDuploCliente getPrimeiro() {

		return primeiro;

	}

	public void setPrimeiro(NoDuploCliente primeiro) {

		this.primeiro = primeiro;

	}

	public NoDuploCliente getUltimo() {

		return ultimo;

	}

	public void setUltimo(NoDuploCliente ultimo) {

		this.ultimo = ultimo;

	}

	public NoDuploCliente getTemp() {

		return temp;

	}

	public void setTemp(NoDuploCliente temp) {

		this.temp = temp;

	}

	public boolean isListaVazia(){

		if (getPrimeiro() == null || getUltimo() == null){

			return true;

		}else{

			return false;

		}

	}

	public void inserirNoInicio(NoDuploCliente novoNo){

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

			System.out.println(getTemp().getItem().toString() + "\n" + getNumNo());

			getPrimeiro().setAnt(getTemp());
			setTemp(getTemp().getProx());


		}

	}

	public void inserirNoFim(NoDuploCliente novoNo){

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

	public void excluirEmQlqPosicao(String nome){


		if(isListaVazia()){

			JOptionPane.showMessageDialog(null, "Cadastro vazio.");
		
		}else  if (getPrimeiro().getItem().getNome().equalsIgnoreCase(nome)){
		

	            	setPrimeiro(getPrimeiro().getProx());
	            	setTemp(getPrimeiro());            	
	        		JOptionPane.showMessageDialog(null, "Primeiro aqui");
			
		}else if(getUltimo().getItem().getNome().equalsIgnoreCase(nome) && getUltimo().getProx()==null) {
					setUltimo(getUltimo().getAnt());
					getUltimo().setProx(null);

					JOptionPane.showMessageDialog(null, "Ultimo aqui");
					
			 }else{   	
			setTemp(getPrimeiro());
			

			while(getTemp().getProx() != null ){
		
					getPrimeiro().setAnt(getTemp());
					setTemp(getTemp().getProx() );
					
					if(getTemp().getItem().getNome().equalsIgnoreCase(nome)){
						JOptionPane.showMessageDialog(null, "Meio aqui");
						getTemp().getAnt().setProx(getTemp().getProx());
	                	getTemp().getProx().setAnt(getTemp().getAnt());
	                	setTemp(getTemp().getProx());
						
				}

			}
			
		}

	}
	

	public Cliente buscar(String nome){

		if(isListaVazia()){

			JOptionPane.showMessageDialog(null, "Não existe nenhum Cadastro");

		}else{

			setTemp(getPrimeiro());

			while(getTemp() != null){

				if(getTemp().getItem().getNome().equalsIgnoreCase(nome)){

					break;

				}else{

					getPrimeiro().setAnt(getTemp());
					setTemp(getTemp().getProx());

				}
			}
		}
		
		return getTemp().getItem();
		
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

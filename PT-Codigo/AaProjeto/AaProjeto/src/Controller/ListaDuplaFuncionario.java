package Controller;

import javax.swing.JOptionPane;



public class ListaDuplaFuncionario {

	private NoDuploFuncionario primeiro, ultimo, temp;
	private int numNo;

	public ListaDuplaFuncionario(){

		setPrimeiro(null);
		setUltimo(null);

	}

	public ListaDuplaFuncionario(NoDuploFuncionario primeiro, NoDuploFuncionario ultimo){

		setPrimeiro(primeiro);
		setUltimo(ultimo);

	}

	public int getNumNo() {

		return numNo;

	}

	public void setNumNo(int numNo) {

		this.numNo += numNo;

	}

	public NoDuploFuncionario getPrimeiro() {

		return primeiro;

	}

	public void setPrimeiro(NoDuploFuncionario primeiro) {

		this.primeiro = primeiro;

	}

	public NoDuploFuncionario getUltimo() {

		return ultimo;

	}

	public void setUltimo(NoDuploFuncionario ultimo) {

		this.ultimo = ultimo;

	}

	public NoDuploFuncionario getTemp() {

		return temp;

	}

	public void setTemp(NoDuploFuncionario temp) {

		this.temp = temp;

	}

	public boolean isListaVazia(){

		if (getPrimeiro() == null || getUltimo() == null){

			return true;

		}else{

			return false;

		}

	}

	public void inserirNoInicio(NoDuploFuncionario novoNo){

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

		String resultado = "";

		setTemp(getPrimeiro());

		while(getTemp() != null){

			resultado += getTemp().getItem().toString() + "\n\n";

			getPrimeiro().setAnt(getTemp());
			setTemp(getTemp().getProx());


		}
		
		JOptionPane.showMessageDialog(null, resultado);
		System.out.println(resultado);
		
	}

	public void inserirNoFim(NoDuploFuncionario novoNo){

		if(isListaVazia()){

			setPrimeiro(novoNo);
			setUltimo(novoNo);
			
			System.out.println("Foi");
			
			setNumNo(1);

		}else{

			novoNo.setAnt(getUltimo());
			getUltimo().setProx(novoNo);
			setUltimo(novoNo);

			System.out.println("foi");

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
	
	
	public void remove(String nome) { //este metodo vai remover um elemento numa lista duplamente encadeada
        if (getPrimeiro() != null) { //se a lista não estiver vazia
            //se for remover o primeiro
            if (getPrimeiro().getItem().getNome().equalsIgnoreCase(nome)) {
            	setPrimeiro(getPrimeiro().getProx());
            	
            } else {
                setTemp(getPrimeiro().getProx());
                getTemp().setAnt(getPrimeiro());
                //percorre a lista
                while (getTemp() != null && !getTemp().getItem().getNome().equalsIgnoreCase(nome)) {
                	setTemp(getTemp().getProx());
                }
                //se temp for diferente de null é pq encontrou mat =
                if (getTemp() != null) {
                	
                	getTemp().getAnt().setProx(getTemp().getProx());
                	getTemp().getProx().setAnt(getTemp().getAnt());
                	
                } //fim do if
            } //fim do else
        } //fim do if
    } //fim do metodo remova
	
	public void buscar(String nome){

		if(isListaVazia()){

			JOptionPane.showMessageDialog(null, "Não Existe nenhum nome cadastrado!");
			
		}else{
			
			setTemp(getPrimeiro());

			while(getTemp() != null){

				if(getTemp().getItem().getNome().equalsIgnoreCase(nome)){

					JOptionPane.showMessageDialog(null, nome + " exite no Cadastro!");
					
					break;

				}else{

					getPrimeiro().setAnt(getTemp());
					setTemp(getTemp().getProx());
					
					JOptionPane.showMessageDialog(null, nome + " não exite no Cadastro");



				}

			}
			
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

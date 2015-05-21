package Controller;
import Model.Cliente;

public class NoDuploFila {
	
	private Cliente cliente;
	private NoDuploFila prox, ant;
	
	public NoDuploFila(){
		
		setCliente(null);
		setProx(null);
		setAnt(null);
		
	}
	
	public NoDuploFila(Cliente cliente){
		
		setCliente(cliente);
		
	}

	

	public Cliente getCliente() {
	
		return cliente;
	
	}

	public void setCliente(Cliente cliente) {
	
		this.cliente = cliente;
	
	}

	public NoDuploFila getProx() {
		return prox;
	}

	public void setProx(NoDuploFila prox) {
		this.prox = prox;
	}

	public NoDuploFila getAnt() {
		return ant;
	}

	public void setAnt(NoDuploFila ant) {
		this.ant = ant;
	}
	
	

}

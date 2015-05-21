
package Controller;
import Model.*;
public class NoDuplo {
	
	private Cliente cliente;
	private NoDuplo prox, ant;
	
	public NoDuplo(){
		
		setCliente(null);
		setProx(null);
		setAnt(null);
		
	}
	
	public NoDuplo(Cliente cliente){
		
		setCliente(cliente);
		
	}

	

	public Cliente getCliente() {
	
		return cliente;
	
	}

	public void setCliente(Cliente cliente) {
	
		this.cliente = cliente;
	
	}

	public NoDuplo getProx() {
		return prox;
	}

	public void setProx(NoDuplo prox) {
		this.prox = prox;
	}

	public NoDuplo getAnt() {
		return ant;
	}

	public void setAnt(NoDuplo ant) {
		this.ant = ant;
	}
	
}

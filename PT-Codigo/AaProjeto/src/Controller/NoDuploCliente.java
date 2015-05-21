
package Controller;
import Model.*;
public class NoDuploCliente {
	
	private Cliente item;
	private NoDuploCliente prox, ant;
	
	public NoDuploCliente(){
		
		setItem(null);
		setProx(null);
		setAnt(null);
		
	}
	
	public NoDuploCliente(Cliente item){
		
		setItem(item);
		
	}

	public Cliente getItem() {
	
		return item;
	
	}

	public void setItem(Cliente item) {
	
		this.item = item;
	
	}

	public NoDuploCliente getProx() {
		return prox;
	}

	public void setProx(NoDuploCliente prox) {
		this.prox = prox;
	}

	public NoDuploCliente getAnt() {
		return ant;
	}

	public void setAnt(NoDuploCliente ant) {
		this.ant = ant;
	}

	public String toString() {
		
		return "NoDuplo [item=" + item + ", prox=" + prox + ", ant=" + ant
				+ "]";
	
	}
	
	
	
}

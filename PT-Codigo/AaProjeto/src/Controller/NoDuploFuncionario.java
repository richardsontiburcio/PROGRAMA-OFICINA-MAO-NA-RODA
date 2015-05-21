
package Controller;
import Model.*;
public class NoDuploFuncionario {
	
	private Funcionario item;
	private NoDuploFuncionario prox, ant;
	
	public NoDuploFuncionario(){
		
		setItem(null);
		setProx(null);
		setAnt(null);
		
	}
	
	public NoDuploFuncionario(Funcionario item){
		
		setItem(item);
		
	}

	public Funcionario getItem() {
	
		return item;
	
	}

	public void setItem(Funcionario item) {
	
		this.item = item;
	
	}

	public NoDuploFuncionario getProx() {
		return prox;
	}

	public void setProx(NoDuploFuncionario prox) {
		this.prox = prox;
	}

	public NoDuploFuncionario getAnt() {
		return ant;
	}

	public void setAnt(NoDuploFuncionario ant) {
		this.ant = ant;
	}

	public String toString() {
		
		return "NoDuplo [item=" + item + ", prox=" + prox + ", ant=" + ant
				+ "]";
	
	}
	
	
	
}

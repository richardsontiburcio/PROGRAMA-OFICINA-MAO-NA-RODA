package Model;

public class Telefone {
	
	private int ddd, fone;
	
	public Telefone(){
		
		setDdd(0);
		setFone(0);
		
	}
	
	public Telefone(int ddd, int fone){
		
		setDdd(ddd);
		setFone(fone);
		
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	
	public String toString() {
		return "Telefone (" + ddd + ") " + fone;
	}
	
	

}

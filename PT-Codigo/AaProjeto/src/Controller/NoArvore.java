package Controller;


public class NoArvore {
    private Object valor; //valor
    private NoArvore direita, esquerda; //referencias
    private int altura;
    
    //construtores
    public NoArvore (Object valor) {
        setValor (valor);
        setEsquerda (null);
        setDireita (null);
        setAltura (0);
    }
    
    public NoArvore(int valor2) {
		// TODO Auto-generated constructor stub
	}

	//getters e setters
    public NoArvore getDireita () {
        return direita;
    }
    public void setDireita(NoArvore direita) {
        this.direita = direita;
    }
    
    public NoArvore getEsquerda () {
        return esquerda;
    }
    public void setEsquerda (NoArvore esquerda) {
        this.esquerda = esquerda;
    }
       
    public Object getValor () {
        return valor;
    }
    public void setValor (Object valor) {
        this.valor = valor;
    }

    public int getAltura () {
        return altura;
    }
    public void setAltura (int altura) {
        this.altura = altura;
    }
}

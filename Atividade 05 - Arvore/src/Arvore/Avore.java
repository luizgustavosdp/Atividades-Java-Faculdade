package Arvore;

public class Avore {

	 private No raiz;
	    
	    private class No {
	        private int valor;
	        private No esquerda;
	        private No direita;
	        
	        public No(int valor) {
	            this.valor = valor;
	            esquerda = null;
	            direita = null;
	        }
	    }
	    
	    public void preFixado(No no) {
	        if (no != null) {
	            System.out.println(no.valor);
	            preFixado(no.esquerda);
	            preFixado(no.direita);
	        }
	    }
}

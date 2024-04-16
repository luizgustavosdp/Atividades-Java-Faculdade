package Modelagem;

public class ArvoreBinaria {
     
	public class No {
	    
	  
		public No esquerda;
	    public No direita;
		public int dado;

		
	    public No getEsquerda() {
			return esquerda;
		}


		public void setEsquerda(No esquerda) {
			this.esquerda = esquerda;
		}


		public No getDireita() {
			return direita;
		}


		public void setDireita(No direita) {
			this.direita = direita;
		}
		  
		public int getDado() {
		    return dado;
			
		}

		public void setDado(int dado) {
			this.dado = dado;
		
		}



		public No(int item) {
	        dado = item;
	        esquerda = direita = null;
	    }
	}
}

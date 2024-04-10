package Visao;

import Negocio.FilaDeEstudante;
import Modelagem.Estudante;
public class SistemaDeFIla {

	public static void main(String[] args) {
		
		 FilaDeEstudante fila = new FilaDeEstudante();

	        // Exemplo de utilização:
	        Estudante estudante1 = new Estudante("João",20);
	        Estudante estudante2 = new Estudante("Maria", 18);
	        Estudante estudante3 = new Estudante("Pedro",15);
	        Estudante estudante4 = new Estudante("Caio", 19);
	        
	        
	        fila.adicionarEstudante(estudante1);
	        fila.adicionarEstudante(estudante2);
	        fila.adicionarEstudante(estudante3);
	        fila.adicionarEstudante(estudante4);
	        
	        fila.exibirFila();

	        fila.removerEstudante();

	        fila.exibirFila();

	}

}

package Negocio;

import javax.swing.JOptionPane;

import Modelagem.Estudante;
import Modelagem.Estudante;
public class FilaDeEstudante {

	    private static final int TAMANHO_MAXIMO = 10;
	    private Estudante[] filaDeEstudantes;
	    private int[] filaDeIdades; 
	    private int tamanho;
	    private int inicio;
	    private int fim;
	
	    public  FilaDeEstudante() {
	        filaDeEstudantes = new Estudante[TAMANHO_MAXIMO];
	        filaDeIdades = new int[TAMANHO_MAXIMO];
	        tamanho = 0;
	        inicio = 0;
	        fim = -1;
  }
	    public void adicionarEstudante(Estudante estudante) {
	    	 if (tamanho == TAMANHO_MAXIMO) {
	             JOptionPane.showMessageDialog(null, "Fila cheia");
	    		 return;
	     }
	    	   int idade = estudante.getIdade();
	    	   fim = (fim + 1) % TAMANHO_MAXIMO;
		       filaDeEstudantes[fim] = estudante;
		       filaDeIdades[fim] = idade;
		       tamanho++;
	           JOptionPane.showMessageDialog(null, "Estudante adicionado à fila com sucesso! \n " + fim +  " Nome: " + estudante.getNome());
	     }
           public void removerEstudante() {
        	   if (tamanho == 0) {
                   JOptionPane.showMessageDialog(null, "Fila vazia");
                   return;
         }
	     
          	   JOptionPane.showMessageDialog(null, " Estudante removido \n " + filaDeEstudantes[inicio].getNome() + ",  Idade: " + filaDeIdades[inicio]);
               inicio = (inicio + 1) % TAMANHO_MAXIMO;
               tamanho--;
	   
	    
        }
           public void exibirFila() {
        	   StringBuilder estudantes = new StringBuilder();
               for (int i = inicio; i <= fim; i++) {
                   estudantes.append(filaDeEstudantes[i].getNome()).append("\n");
               }
               JOptionPane.showMessageDialog(null, estudantes.toString());
    
	
           }	
		}
		
			
	
           
	    

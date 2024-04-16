package Negocio;

import Modelagem.ArvoreBinaria;
import javax.swing.JOptionPane;
import Modelagem.ArvoreBinaria;
import Modelagem.ArvoreBinaria.No;

public class ArvoreOrdem {
    No raiz;

    public ArvoreOrdem() {
        raiz = null;
   
    }
     public void inserir(int dado) {
        raiz = inserir(raiz, dado);

    }
     private No inserir(No raiz, int dado) {
        return null;
    }
     public void emOrdem() {
    	 emOrdem(raiz);
     }
     private void emOrdem(No raiz) {
         if (raiz != null) {
             emOrdem(raiz.esquerda);
             JOptionPane.showMessageDialog(null, raiz.dado);
             emOrdem(raiz.direita);
         }
     
     }
	}
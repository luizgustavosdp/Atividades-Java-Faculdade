package Negocio;

import javax.swing.JOptionPane;

import Modelagem.Computador;

          public class PilhaComputador {private Computador[] pilha; // Array para armazenar os computadores
          private int topo; // Índice do topo da pilha
          private int tamanhoMax; // Tamanho máximo da pilha

          // Construtor para inicializar a pilha com o tamanho máximo especificado
          public PilhaComputador(int tamanhoMax) {
          this.tamanhoMax = tamanhoMax;
          pilha = new Computador[tamanhoMax];
          topo = -1;
}

          // Método para empilhar um computador na pilha
          public void empilhar(Computador computador) {
        	  
          if (topo == tamanhoMax - 1) {
        JOptionPane.showMessageDialog(null, "Pilha cheia, impossível empilhar mais computadores.");
        
         } else {
        topo++; // Incrementa o topo
        pilha[topo] = computador; // Insere o computador na posição do topo
}
}

        // Método para desempilhar um computador da pilha
        public Computador desempilhar() {
        	
        	
        if (isEmpty()){
        JOptionPane.showMessageDialog(null, "Pilha vazia, impossível desempilhar.");
        return null;
        
        
        }else {
        Computador computadorDesempilhado = pilha[topo]; // Obtém o computador no topo da pilha
        topo--; // Decrementa o topo
        return computadorDesempilhado;
}
}

        // Método para verificar se a pilha está vazia
        public boolean isEmpty() {
        return topo == -1;
}

        // Método para verificar se a pilha está cheia
        public boolean isFull() {
        return topo == tamanhoMax - 1;
}

        // Método para obter o tamanho atual da pilha
        public int size() {
        return topo + 1;
}
}

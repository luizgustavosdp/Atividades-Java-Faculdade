package Negocio;

import Modelagem.Pessoa;

public class ListaDoArray {
    private No raiz;
    
    private class No {
        private Pessoa pessoa;
        private No esquerda;
        private No direita;
        
        public No(Pessoa pessoa) {
            this.pessoa = pessoa;
            esquerda = null;
            direita = null;
        }
    }
    
    public static void adicionarPessoa(Pessoa pessoa) {
        raiz = adicionarRecursivo(raiz, pessoa);
    }
    
    private No adicionarRecursivo(No atual, Pessoa pessoa) {
        if (atual == null) {
            return new No(pessoa);
        }
        
        if (pessoa.getIdade() < atual.pessoa.getIdade()) {
            atual.esquerda = adicionarRecursivo(atual.esquerda, pessoa);
        } else {
            atual.direita = adicionarRecursivo(atual.direita, pessoa);
        }
        
        return atual;
    }
    
    public void exibirPreFixado() {
        preFixado(raiz);
    }
    
    private void preFixado(No no) {
        if (no != null) {
            System.out.println("Nome: " + no.pessoa.getNome() + ", Idade: " + no.pessoa.getIdade());
            preFixado(no.esquerda);
            preFixado(no.direita);
        }
    }
}

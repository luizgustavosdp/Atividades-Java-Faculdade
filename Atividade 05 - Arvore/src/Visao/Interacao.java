package Visao;

import Modelagem.Pessoa;
import javax.swing.JOptionPane;
import Negocio.ListaDoArray;

public class Interacao {
    public static void main(String[] args) {
    	ListaDoArray gerenciador = new ListaDoArray();
        
        int opcao;
        do {
            String menu = "Escolha uma opção:\n" +
                          "1. Adicionar Pessoa\n" +
                          "2. Exibir Árvore Genealógica (Pré-fixado)\n" +
                          "3. Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
                    Pessoa pessoa = new Pessoa(nome, idade);
                    gerenciador.adicionarPessoa(pessoa);
                    JOptionPane.showMessageDialog(null, "Pessoa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("Árvore Genealógica (Pré-fixado):");
                    gerenciador.exibirPreFixado();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 3);
    }
}

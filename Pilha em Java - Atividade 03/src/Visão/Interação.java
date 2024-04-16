package Visão;
import javax.swing.JOptionPane;

import Modelagem.Computador;
import Negocio.PilhaComputador;


public class Interação {
	
	public static void main(String[] args) {
		
           //Cria uma nova instância da pilha de computadores com tamanho máximo de 5
           PilhaComputador pilha = new PilhaComputador(5);

        
           while (true) {
        	
        	
            String escolha = JOptionPane.showInputDialog("Escolha uma opção:\n" +
                    "1. Empilhar computador\n" +
                    "2. Desempilhar computador\n" +
                    "3. Sair");

            switch (escolha) {
            
                case "1":
                    // Solicita os dados do computador ao usuário e cria uma instância de Computador
                    String marca = JOptionPane.showInputDialog("Digite a marca do computador:");
                    String modelo = JOptionPane.showInputDialog("Digite o modelo do computador:");
                    String processador = JOptionPane.showInputDialog("Digite o processador do computador:");
                    
                    int memoriaRAM = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de memória RAM (em GB):"));
                    Computador computador = new Computador(marca, modelo, processador, memoriaRAM);
                    
                    // Empilha o computador na pilha
                    
                    pilha.empilhar(computador);
                    break;
                    
                    
                case "2":
                	
                    // Verifica se a pilha não está vazia e desempilha um computador
                    if (!pilha.isEmpty()) {
                        Computador computadorDesempilhado = pilha.desempilhar();
                        JOptionPane.showMessageDialog(null, "Computador desempilhado:\n" + computadorDesempilhado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pilha vazia, impossível desempilhar.");
                    }
                    break;
                    
                    
                case "3":
                    System.exit(0);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
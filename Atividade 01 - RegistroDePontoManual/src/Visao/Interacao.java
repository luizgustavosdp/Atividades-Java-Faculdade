package Visao;

import javax.swing.JOptionPane;
import Modelagem.Colaborador;
import Negocio.Vetor;

public class Interacao {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(); // Criar uma instância de Vetor

        JOptionPane.showMessageDialog(null, "Sistema de Ponto Eletronico Manual ");

        String nome = JOptionPane.showInputDialog(null, "Digite seu nome completo: ");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua Matricula"));
        String horarioEntrada = JOptionPane.showInputDialog(null, "Digite a Hora de Entrada (Hora:minuto):");
        String horarioSaida = JOptionPane.showInputDialog(null, "Digite a Hora de Saída (Hora:minuto):");
        String dataDoRegistro = JOptionPane.showInputDialog(null, "Digite a data do registro (dia/mes/ano):");

        Colaborador luiz = new Colaborador();
        luiz.setNome(nome);
        luiz.setMatricula(matricula);
        luiz.setHorarioEntrada(horarioEntrada);
        luiz.setHorarioSaida(horarioSaida);
        luiz.setDataDoRegistro(dataDoRegistro);

        vetor.adicionarInformacoes(0, luiz); // Adiciona o colaborador ao vetor na posição 0

        // Exemplo de como acessar as informações do colaborador no vetor
        Colaborador primeiroColaborador = vetor.colaboradores[0];
        System.out.println("Nome: " + primeiroColaborador.getNome());
        System.out.println("Matrícula: " + primeiroColaborador.getMatricula());
        System.out.println("Horário de Entrada: " + primeiroColaborador.getHorarioEntrada());
        System.out.println("Horário de Saída: " + primeiroColaborador.getHorarioSaida());
        System.out.println("Data do Registro: " + primeiroColaborador.getDataDoRegistro());
    }
}

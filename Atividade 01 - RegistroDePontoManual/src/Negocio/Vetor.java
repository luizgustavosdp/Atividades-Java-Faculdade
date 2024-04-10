package Negocio;

import Modelagem.Colaborador;

public class Vetor {
	
	public Colaborador[] colaboradores = new Colaborador[4];
	public void adicionarInformacoes(int posicao, Colaborador colaborador) {
		colaboradores [posicao] = colaborador;
		
 }
}

package Visao;

import javax.swing.JOptionPane;
import Negocio.ArvoreOrdem;

public class ArvoreInteracao {

	public static void main(String[] args) {
		
		ArvoreOrdem folha = new ArvoreOrdem();
		
		folha.inserir(10);
		folha.inserir(12);
		folha.inserir(18);
		folha.inserir(23);
		folha.inserir(26);
		folha.inserir(20);
		folha.inserir(03);
		folha.inserir(38);
		
		JOptionPane.showMessageDialog(null, "Folhas em ordens:");
		folha.emOrdem();
		
	}

}

package main;

import javax.swing.JOptionPane;

public class AcaoFinal {
	
	public void Continuar() {
		int operacao = JOptionPane.showConfirmDialog(null, "Deseja fazer outra operação?");
		if(operacao == 0) {
			Principal.main(null);
		}
		if(operacao == 1) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
		if(operacao == 2) {
			JOptionPane.showMessageDialog(null, "Programa concluído");
		}
	}
}

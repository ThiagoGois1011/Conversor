package conversorMedidas;

import javax.swing.JOptionPane;

public class ConverterMedidas {
	
	public void deCmParaMm(double valor) {
		double medida = 10 * valor;
		JOptionPane.showMessageDialog(null, "O resultado é " + medida + "mm");
	}
	
	public void deCmParaKm(double valor) {
		double medida = 100000 /valor;
		JOptionPane.showMessageDialog(null, "O resultado é " + medida + "km");
	}
	
	public void deMmParaCm(double valor) {
		double medida = 10 * valor;
		JOptionPane.showMessageDialog(null, "O resultado é " + medida + "mm");
	}
	
	public void deKmParaCm(double valor) {
		double medida = 100000 * valor;
		JOptionPane.showMessageDialog(null, "O resultado é " + medida + "mm");
	}
	

}

package conversorMoeda;

import javax.swing.JOptionPane;

public class ConverterMoeda {
	
	public void ConverterReaisParaDolar(double valor) {
		double moeda = 5.17 * valor;
		moeda = Math.round(moeda);
		JOptionPane.showMessageDialog(null, "Você tem $ " + moeda + " Dólares");
	}
	
	public void ConverterReaisParaEuro(double valor) {
		double moeda = 5.17 * valor;
		moeda = Math.round(moeda);
		JOptionPane.showMessageDialog(null, "Você tem $ " + moeda + " Euros");
	}

	public void ConverterReaisParaLibras(double valor) {
		double moeda = 5.98 * valor;
		moeda = Math.round(moeda);
		JOptionPane.showMessageDialog(null, "Você tem $ " + moeda + " Libras");
	}

	public void ConverterReaisParaPesoArgentino(double valor) {
		double moeda = 0.037 * valor;
		System.out.println(moeda);
		moeda = Math.round(moeda);
		System.out.println(moeda);
		JOptionPane.showMessageDialog(null, "Você tem $ " + moeda + "em Peso Argentino");
	}

	public void ConverterReaisParaPesoChileno(double valor) {
		double moeda = 0.0057 * valor;
		moeda = Math.round(moeda);
		JOptionPane.showMessageDialog(null, "Você tem $ " + moeda + " em Peso Chileno");
	}

	public void ConverterDolaresParaReais(double valor) {
		double moeda = 5.17 / valor;
		moeda = Math.round(moeda);
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moeda + " Reais");
	}
	
	public void ConverterEuroParaReais(double valor) {
		double moeda = 5.17 / valor;
		moeda = Math.round(moeda);
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moeda + " Reais");
	}
	
	public void ConverterLibrasParaReais(double valor) {
		double moeda = 5.98 / valor;
		moeda = Math.round(moeda);
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moeda + " Reais");
	}
	
	public void ConverterPesoArgentinoParaReais(double valor) {
		double moeda = 0.037 / valor;
		moeda = Math.round(moeda);
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moeda + " Reais");
	}
	
	public void ConverterPesoChilenoParaReais(double valor) {
		double moeda = 0.0057 / valor;
		moeda = Math.round(moeda);
		JOptionPane.showMessageDialog(null, "Você tem R$ " + moeda + " Reais");
	}
	
	


}

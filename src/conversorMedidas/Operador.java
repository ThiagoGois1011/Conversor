package conversorMedidas;

import javax.swing.JOptionPane;

import main.AcaoFinal;

public class Operador {

	public void Controler(double valor) {
		ConverterMedidas c = new ConverterMedidas();
		 AcaoFinal a = new AcaoFinal();
		 String opcao = (JOptionPane.showInputDialog(null,
					"Escolha a unidade de medida para a qual você deseja converter ", "Medidas",
					JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De cm para mm",
					"De cm para km", "De mm para cm", "De km para cm"}, "Escolha")).toString();
	 switch (opcao) {
		case "De cm para mm": {
			c.deCmParaMm(valor);
			a.Continuar();
			break;
		}
		
		case "De cm para km": {
			c.deCmParaKm(valor);
			break;
		}
		
		case "De mm para cm": {
			c.deMmParaCm(valor);
			break;
		}
		
		case "De km para cm": {
			c.deKmParaCm(valor);
			break;
		}
	 }
	}
}

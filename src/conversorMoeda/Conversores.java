package conversorMoeda;

import javax.swing.JOptionPane;

import main.AcaoFinal;

public class Conversores {
	
	public void Controler(double valor) {
		ConverterMoeda c = new ConverterMoeda();
		AcaoFinal a = new AcaoFinal();
		String  opcao = (JOptionPane.showInputDialog(null,
				"Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares",
				"De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino",
				"De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais",
				"De Libras a Reais", "De Peso Argentino a Reais",
				"De Peso Chileno a Reais"}, "Escolha")).toString();
		
		 switch (opcao) {
		case "De Reais a Dólares": {
			c.ConverterReaisParaDolar(valor);
			a.Continuar();
			break;
		}
		
		case "De Reais a Euros": {
			c.ConverterReaisParaEuro(valor);
			break;
		}
		
		case "De Reais a Libras": {
			c.ConverterReaisParaLibras(valor);
			break;
		}
		
		case "De Reais a Peso Argentino": {
			c.ConverterReaisParaPesoArgentino(valor);
			break;
		}
		
		case "De Reais a Peso Chileno": {
			c.ConverterReaisParaPesoChileno(valor);
			break;
		}
		
		case "De Dólares a Reais": {
			c.ConverterDolaresParaReais(valor);
			break;
		}
		case "De Euros a Reais": {
			c.ConverterEuroParaReais(valor);
			break;
		}
		
		case "De Libras a Reais": {
			c.ConverterLibrasParaReais(valor);
			break;
		}
		
		case "De Peso Argentino a Reais": {
			c.ConverterPesoArgentinoParaReais(valor);
			break;
		}
		
		case "De Peso Chileno a Reais": {
			c.ConverterPesoChilenoParaReais(valor);
			break;
		}
		
		}

	       
	}
}

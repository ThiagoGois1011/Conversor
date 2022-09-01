package main;

import javax.swing.JOptionPane;

import conversorMedidas.Operador;
import conversorMoeda.Conversores;

public class Principal {
	
	public static void main(String[] args) {
		String painel = (JOptionPane.showInputDialog(null, "Escolha uma opção","Menu",JOptionPane.PLAIN_MESSAGE,
				null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha")).toString();
		Conversores c = new Conversores();
		Operador o = new Operador();
		switch (painel) {
			case "Conversor de Moeda": {
				try {
					String input = (JOptionPane.showInputDialog("insira o valor: ")).toString();
					
					if(checa(input)){
						double x = Double.parseDouble(input);
						c.Controler(x);
					}else {
						JOptionPane.showMessageDialog(null,"valor invalido");
						Principal.main(null);
					}
					
					break;
					
				}catch(NullPointerException e) {
					break;
				}
			}
			case "Conversor de Temperatura": {
				try {
					String input = (JOptionPane.showInputDialog("insira o valor: ")).toString();
					
					if(checa(input)){
						double x = Double.parseDouble(input);
						o.Controler(x);
					}else {
						JOptionPane.showMessageDialog(null,"valor invalido");
						Principal.main(null);
					}
					
					break;
				}catch(NullPointerException e) {
					break;
				}
			}
		}
		
	}
	
	public static boolean checa(String valor) {
		
		try {
			String v = valor.replace(",", ".");
			double x = Double.parseDouble(v);
			
			if(x >= 0 || x < 0){
				return true;
			}else {
				return false;
			}
			
		}catch(NumberFormatException e) {
			return false;	
		}
	}

}


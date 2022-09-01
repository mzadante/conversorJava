package ConversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMonedas {  
	
	public void dePesoArADolar(double valor) {
		double monedaDolar = valor/ 138.08;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");
	}//Dos decimales fnc. Math - Cambia moneda de pesos argentinos a dolar -->Muestra Dolar

	public void dePesoArAEuro(double valor) {
		double monedaEuro = valor/137.61;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + " Euros");
	}

	public void dePesoArALibrasEsterlina(double valor) {
		double monedaLibraEsterlina = valor/162.24;
		monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLibraEsterlina + " Libras Esterlinas");
	}

	public void dePesoArAYenJapones(double valor) {
		double monedaYenJapones = valor/1;
		monedaYenJapones = (double) Math.round(monedaYenJapones * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaYenJapones + " Yen Japones");
}

	public void dePesoArAWonSurCoreano(double valor) {
		double monedaWonSurCoreano = valor/9.72;
		monedaWonSurCoreano = (double) Math.round(monedaWonSurCoreano * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaWonSurCoreano + " Won sul-coreano");
	}

//Orden Inverso

	public void deDolarAPesoAr(double valor) {
		double monedaPesoAr = valor*138.08;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}

	public void deEuroAPesoAr(double valor) {
		double monedaPesoAr = valor*137.61;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}

	public void deLibrasEsterlinaAPesoAr(double valor) {
		double monedaPesoAr = valor*162.24;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}

	public void deYenJaponesAPesoAr(double valor) {
		double monedaPesoAr = valor*1;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}

	public void deWonSurCoreanoPesoAr(double valor) {
		double monedaPesoAr = valor*9.72;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}


}

package ConversorTemperatura;

import javax.swing.JOptionPane;

//(0 °C × 9/5) + 32 = 32 °F  centigrado a farenheit
//(32 °F − 32) × 5/9 = 0 °C  farenheit a centigrado
//0 °C + 273.15 = 273,15 K   centigrado a kelvin
//0 K − 273.15 = -273,1 °C	 kelvin a centigrado
//(32 °F − 32) × 5/9 + 273.15 = 273,15 K  farenheit a kelvin
//(0 K − 273.15) × 9/5 + 32 = -459,7 °F   kelvin a farenheit

public class ConvertirTemperatura {
	
	public void deCentigradoAfarenheit(double valor) {
		double farenheit = (valor-32) * 5/9;
		farenheit = (double) Math.round(farenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, "Temperatura:" + farenheit + " F°");
	}
	public void deFarenheitAcentigrado(double valor) {
		double centigrado = (valor*9/5) +32; 
		centigrado = (double) Math.round(centigrado * 100d)/100;
		JOptionPane.showMessageDialog(null, "Temperatura:" + centigrado + " C°");
	}
	public void deCentigradoAkelvin(double valor) {
		double Kelvin = (valor+273.15); 
		Kelvin = (double) Math.round(Kelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, "Temperatura:" + Kelvin + " K°");
	}
	public void deKelvinAcentigrado(double valor) {
		double centigrado = (valor-273.15); 
		centigrado = (double) Math.round(centigrado * 100d)/100;
		JOptionPane.showMessageDialog(null, "Temperatura: " + centigrado + " C°");
	}
	public void deFarenheitAkelvin(double valor) {
		double Kelvin = (valor-32)*5/9 + 273.15; 
		Kelvin = (double) Math.round(Kelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, "Temperatura: " + Kelvin + " K°");
	}
	public void deKelvinAfarenheit(double valor) {
		double farenheit = (valor-273.15)*9/5 + 32;
		farenheit = (double) Math.round(farenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, "Temperatura: " + farenheit + " F°");
	}
	
}

package ConversorLongitud;

import javax.swing.JOptionPane;

public class ConvertirLongitud {
	public void deMilimetroAcentimetro(double valor) {
		double centimetro = valor/ 10;
		centimetro = (double) Math.round(centimetro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Obtienes: " + centimetro + " Centimetros");
	}
	public void deCentimetroAmilimetro(double valor) {
		double milimetro = valor*10 ;
		milimetro = (double) Math.round(milimetro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Obtienes: " + milimetro + " Milimetros");
	}
	
	public void deCentimetroAmetro(double valor) {
		double metro = valor/100;
		metro = (double) Math.round(metro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Obtienes: " + metro + " Metros");
	}
	public void deMetroAcentimetro(double valor) {
		double centimetro = valor*100;
		centimetro = (double) Math.round(centimetro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Obtienes: " + centimetro + " Centimetros");
	}
	
	public void deCentimetroAKilometro(double valor) {
		double kilometro = valor/100000;
		kilometro = (double) Math.round(kilometro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Obtienes: " + kilometro + " Metros");
	}
	public void dekilometroAcentimetro(double valor) {
		double centimetro = valor*100000;
		centimetro = (double) Math.round(centimetro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Obtienes: " + centimetro + " Centimetros");
	}
}

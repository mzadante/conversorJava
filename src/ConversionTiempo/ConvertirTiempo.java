package ConversionTiempo;

import javax.swing.JOptionPane;

public class ConvertirTiempo {
	public void deMinutoAsegundo(double valor) {
		double segundos = valor*60;
		segundos = (double) Math.round(segundos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiempo de: " + segundos + " Segundos");
	}
	public void deSegundoAminuto(double valor) {
		double minutos = valor/60;
		minutos = (double) Math.round(minutos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiempo de: " + minutos + " Minutos");
	}
	public void deMinutoAhora(double valor) {
		double hora = valor/60;
		hora = (double) Math.round(hora * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiempo de: " + hora + " Horas");
	}
	public void deHoraAminuto(double valor) {
		double minutos = valor*60;
		minutos = (double) Math.round(minutos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiempo de: " + minutos + " Minutos");
	}
	public void deHoraAdia(double valor) {
		double dia = valor/24;
		dia = (double) Math.round(dia * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiempo de: " + dia + " Dias");
	}
	public void deDiasAhora(double valor) {
		double horas = valor*24;
		horas = (double) Math.round(horas * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiempo de: " + horas + " Horas");
	}
	public void deDiaAsemana(double valor) {
		double semana = valor/7;
		semana = (double) Math.round(semana * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiempo de: " + semana + " Semanas");
	}
	public void deSemanaAdias(double valor) {
		double dias = valor*7;
		dias = (double) Math.round(dias * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiempo de: " + dias + " Dias");
	}
}

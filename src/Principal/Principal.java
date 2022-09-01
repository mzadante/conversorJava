package Principal;

import javax.swing.JOptionPane;

import ConversionTiempo.OpcionesTiempo;
import ConversorLongitud.OpcionesLongitud;
import ConversorMoneda.OpcionesConversion;
import ConversorTemperatura.OpcionesTemperatura;

public class Principal {

	public static void main(String[] args) {
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesTemperatura temp = new OpcionesTemperatura();
		OpcionesTiempo time=new OpcionesTiempo();
		OpcionesLongitud distancia=new OpcionesLongitud();
		
		while (true) {
			String opcion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "MENU", JOptionPane.PLAIN_MESSAGE, null,
					new Object[]{"Conversor de Monedas", "Conversor de Temperatura","Conversor de Tiempo","Conversor de Longitud"}, "Elegir").toString();
			
			switch (opcion) {
			case "Conversor de Monedas": 
				String entrada = JOptionPane.showInputDialog(null, "Ingrese una valor");
				double valorIngresado= Double.parseDouble(entrada);
				conversion.ConvertirMonedas(valorIngresado);
				break;
			case "Conversor de Temperatura": 
				String tempEntrada = JOptionPane.showInputDialog(null, "Ingrese una valor");
				double entradaTemp= Double.parseDouble(tempEntrada);
				temp.conversionTemp(entradaTemp);
				break;
			case "Conversor de Tiempo": 
				String tiempoEntrada = JOptionPane.showInputDialog(null, "Ingrese una valor");
				double entradatiempo= Double.parseDouble(tiempoEntrada);
				time.ConversionTiempo(entradatiempo);
				break;
			case "Conversor de Longitud": 
				String distanciaEntrada = JOptionPane.showInputDialog(null, "Ingrese una valor");
				double entradaDistancia= Double.parseDouble(distanciaEntrada);
				distancia.ConvertirDistancia(entradaDistancia);
				break;	
			}
		}
	}
}

	

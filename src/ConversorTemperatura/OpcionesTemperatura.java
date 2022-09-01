package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesTemperatura {
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	public void conversionTemp(double valor) {
		String opcion = JOptionPane.showInputDialog(null, "Elije la Temperatura a Convertir","TEMPERATURAS",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"de Grados C° a F°" ,"de F° a C°","de Grados C° a K°","de Grados K° a C°","de Grados F° a K°",
								"de Grados K° a F°"},"selección").toString();
		switch (opcion) {
		case "de Grados C° a F°": 
			temperatura.deCentigradoAfarenheit(valor);
			break;
		
		case "de F° a C°": 
			temperatura.deFarenheitAcentigrado(valor);
			break;
		case "de Grados C° a K°": 
			temperatura.deCentigradoAkelvin(valor);
			break;
		case "de Grados K° a C°": 
			temperatura.deKelvinAcentigrado(valor);
			break;
		case "de Grados F° a K°": 
			temperatura.deFarenheitAkelvin(valor);
			break;
		case "de Grados K° a F°": 
			temperatura.deKelvinAfarenheit(valor);
			break;	
		}
	}
}

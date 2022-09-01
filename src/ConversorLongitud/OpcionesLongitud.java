package ConversorLongitud;

import javax.swing.JOptionPane;

public class OpcionesLongitud {
	ConvertirLongitud longitud= new ConvertirLongitud();
	public void ConvertirDistancia(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la Longitud a Convertir","LONGITUD",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"de Milimetro A Centimetro" ,"de Centimetro A Milimetro","de Centimetro a Metro",
							"de Metro a Centimetro","de Centimetro a Kilometro","de Kilometro a Centimetro",}
									,"selección")).toString();
		switch (opcion) {
		case "de Milimetro A Centimetro":
			longitud.deMilimetroAcentimetro(valor);
			break;
		case "de Centimetro A Milimetro":
			longitud.deCentimetroAmilimetro(valor);
			break;
		case "de Centimetro a Metro":
			longitud.deCentimetroAmetro(valor);
			break;
		case "de Metro a Centimetro":
			longitud.deMetroAcentimetro(valor);
			break;
		case "de Centimetro a Kilometro":
			longitud.deCentimetroAKilometro(valor);
			break;
		case "de Kilometro a Centimetro":
			longitud.dekilometroAcentimetro(valor);
			break;
		}
		
	}
}
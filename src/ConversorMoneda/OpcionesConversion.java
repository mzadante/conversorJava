package ConversorMoneda;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda para convertir tu dinero","MONEDAS",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"de Peso Argentino a Dolar" ,"de Peso Argentino a Euro","de Peso Argentino a Libras Esterlinas",
								"de Peso Argentino a Yen Japones", "de Peso Argentino a Won Sur Coreano", "de Dolar a Peso Argentino",
									"de Euro a Peso Argentino","de Libras Esterlinas a Peso Argentino", "de Yen Japones a Peso Argentino",
										"de Won Sur Coreano a Peso Argentino"},"selección")).toString();
		switch (opcion) {
		case "de Peso Argentino a Dolar": 
			monedas.dePesoArADolar(valor);
			break;
		
		case "de Peso Argentino a Euro": 
			monedas.dePesoArAEuro(valor);
			break;
		
		case "de Peso Argentino a Libras Esterlinas": 
			monedas.dePesoArALibrasEsterlina(valor);;
			break;
		
		case "de Peso Argentino a Yen Japones": 
			monedas.dePesoArAYenJapones(valor);
			break;
		case "de Peso Argentino a Won Sur Coreano": 
			monedas.dePesoArAWonSurCoreano(valor);
			break;
		
		case "de Dolar a Peso Argentino": 
			monedas.deDolarAPesoAr(valor);
			break;
			
		case "de Euro a Peso Argentino": 
			monedas.deEuroAPesoAr(valor);
			break;
			
		case "de Libras Esterlinas a Peso Argentino": 
			monedas.deLibrasEsterlinaAPesoAr(valor);
			break;	
		case "de Yen Japones a Peso Argentino": 
			monedas.deYenJaponesAPesoAr(valor);
			break;
		case "de Won Sur Coreano a Peso Argentino": 
			monedas.deWonSurCoreanoPesoAr(valor);
			break;	
		}
		
	}
	
}

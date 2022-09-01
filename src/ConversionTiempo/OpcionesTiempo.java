package ConversionTiempo;

import javax.swing.JOptionPane;

public class OpcionesTiempo {
	
	ConvertirTiempo tiempo= new ConvertirTiempo();
	
	public void ConversionTiempo(double valor) {
	String opcion = JOptionPane.showInputDialog(null, "Elije el Tiempo a convertir","TIEMPO",
			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{"de Minuto a Segundos","de Segundos a Minutos","de Minutos a Hora", "de Hora a Minutos","de Horas a Dia",
							"de Dias a Horas","de Dias a Semanas","de Semanas a Dias"},"selección").toString();

	switch (opcion){
	
	case "de Minuto a Segundos":
		
		tiempo.deMinutoAsegundo(valor);
		break;
	
	case "de Segundos a Minutos": 
		tiempo.deSegundoAminuto(valor);
		break;
		
	case "de Minutos a Hora":
		
		tiempo.deMinutoAhora(valor);
		break;
	
	case "de Hora a Minutos": 
		tiempo.deHoraAminuto(valor);
		break;
		
	case "de Horas a Dia":	
		tiempo.deHoraAdia(valor);
		break;
	
	case "de Dias a Horas": 
		tiempo.deDiasAhora(valor);
		break;
	case "de Dias a Semanas":	
		tiempo.deDiaAsemana(valor);
		break;
	
	case "de Semanas a Dias": 
		tiempo.deSemanaAdias(valor);
		break;
	}
}
}

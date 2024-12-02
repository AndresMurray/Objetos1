package Ejercicio19;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {
	
	
	public EnvioInternacional (LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double pesoEnGramos) {
		super(fechaDespacho,direccionOrigen,direccionDestino,pesoEnGramos);
		 
	}
	
	public double costoEnvio () {
		
		if(this.getPesoEnGramos()<1000)
			return 5000 + (10*this.getPesoEnGramos());
		else
			return 5000 + (12*this.getPesoEnGramos());
			
	}
	
	

}

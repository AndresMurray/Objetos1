package Ejercicio19;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
	
	private int distanciaEnKm;
	
	
	
	public EnvioInterurbano (LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double pesoEnGramos,int distanciaEnKm) {
		super(fechaDespacho,direccionOrigen,direccionDestino,pesoEnGramos);
		this.distanciaEnKm=distanciaEnKm;
		 
	}
	
	public double costoEnvio () {
		
		if(this.distanciaEnKm < 100) 
			return 20*this.getPesoEnGramos();
		else
			if(this.distanciaEnKm >=100 && this.distanciaEnKm <=500)
				return 25*this.getPesoEnGramos();
			else
				return 30*this.getPesoEnGramos();
				
	}

}

package Ejercicio19;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	
	private boolean envioRapido;
	
	
	public EnvioLocal (LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double pesoEnGramos,boolean envioRapido) {
		super(fechaDespacho,direccionOrigen,direccionDestino,pesoEnGramos);
		this.envioRapido=envioRapido;
		 
	}
	
	public double costoEnvio () {
		
		if(this.envioRapido) {
			return 1500;
		}
		else return 1000;
	}

}

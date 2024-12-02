package ParcialUno;

import java.time.LocalDate;

public class EventoVirutal extends Evento {
	
	private double montoEnvio;

	public EventoVirutal(String nombre, LocalDate fecha, String temaPpal, double precioInscripcion, double precioRemera,
			double montoEnvio) {
		super(nombre, fecha, temaPpal, precioInscripcion, precioRemera);
		this.montoEnvio = montoEnvio;
	}
	
	public double getPrecio(LocalDate fecha) {
		double precio = super.getPrecio(fecha);
		return precio + this.montoEnvio;
	}

}

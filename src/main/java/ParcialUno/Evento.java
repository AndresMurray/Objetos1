package ParcialUno;
import java.time.*;

public abstract class Evento {
	
	private String nombre;
	private LocalDate fecha;
	private String temaPpal;
	private double precioInscripcion;
	private double precioRemera;
	
	public Evento(String nombre, LocalDate fecha, String temaPpal, double precioInscripcion, double precioRemera) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.temaPpal = temaPpal;
		this.precioInscripcion = precioInscripcion;
		this.precioRemera = precioRemera;
	}
	
	public double getPrecio(LocalDate fecha) {
		double precio = this.precioInscripcion*this.precioRemera;
		if(fecha.equals(this.fecha))
			return precio*1.20;
		else
			return precio;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	

}

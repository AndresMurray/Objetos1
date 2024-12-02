package ParcialUno;

import java.time.LocalDate;
import java.util.*;

public class EventoPresencial extends Evento{
	
	private List<Sede> sedes;

	public EventoPresencial(String nombre, LocalDate fecha, String temaPpal, double precioInscripcion,
			double precioRemera,ArrayList<Sede> sedes) {
		super(nombre, fecha, temaPpal, precioInscripcion, precioRemera);
		this.sedes = sedes;
	}
	
	public double getPrecio(LocalDate fecha) {
		
		double precio = super.getPrecio(fecha);
		return this.sedes.stream()
				.mapToDouble(s -> s.getPrecioTotal())
				.sum()+precio;
		
	}
	
	
	

}

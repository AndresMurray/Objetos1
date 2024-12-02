package Ejercicio17;
import java.util.*;
import java.time.*;

public class Propiedad {
	
	private String direccion;
	private String nombreDescriptivo;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	
	
	
	
	public Propiedad(String direccion, String nombreDescriptivo, double precioPorNoche) {
		this.direccion = direccion;
		this.nombreDescriptivo = nombreDescriptivo;
		this.precioPorNoche = precioPorNoche;
		this.reservas= new ArrayList<Reserva>();
	}

	public boolean estaDisponible(DateLapse periodo) {
		
		return this.reservas.stream().noneMatch(reserva -> reserva.overlaps(periodo));

	}
	
	public boolean crearReserva (DateLapse periodo) {
		
		if (this.estaDisponible(periodo)) {
			Reserva r = new Reserva (this,periodo);
			reservas.add(r);
			return true; // esto es necesario? tiene que devolver algo?
			
		}
		return false;
		
	}
	
	public double getPrecio () {
		return this.precioPorNoche;
	}
	
	public void cancelarReserva (Reserva unaReserva) {
		if(!unaReserva.reservaEnCurso())
			this.reservas.remove(unaReserva);
	}
	
	
	public double precioTotalReservas(DateLapse periodo) {
		
		return reservas.stream()
				.filter(reservas -> reservas.overlaps(periodo))
				.mapToDouble(r -> r.calcularPrecio())
				.sum();
			
		 
	 }
	
	public List<Reserva> getReservas(){
		return this.reservas;
	}



}

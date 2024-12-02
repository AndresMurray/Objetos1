package Ejercicio19;
import java.time.*;

public abstract class Envio {
	
	private LocalDate fechaDespacho;
	private String direccionOrigen;
	private String direccionDestino;
	private double pesoEnGramos;
	
	
	
	
	public Envio(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double pesoEnGramos) {
		this.fechaDespacho = fechaDespacho;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.pesoEnGramos = pesoEnGramos;
	}

	public double getPesoEnGramos () {
		return this.pesoEnGramos;
	}
	
	public boolean estaIncluido (LocalDate inicio, LocalDate fin) {
		return ((inicio.isBefore(this.fechaDespacho) || inicio.isEqual(this.fechaDespacho)) &&
	            (fin.isAfter(this.fechaDespacho) || fin.isEqual(this.fechaDespacho)));
	}
	
	
	
	public abstract double costoEnvio();

}

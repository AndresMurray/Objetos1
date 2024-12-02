package Ejercicio19;
import java.util.*;
import java.time.*;

public abstract class Cliente {
	
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	
	
	
	
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new ArrayList<Envio>();
	}


	public void  agregarEnvio(Envio unEnvio) {
		this.envios.add(unEnvio);
	}
	
	
	public double calcularMonto(LocalDate fechaInicio, LocalDate fechaFin) {
		
		return this.envios.stream()
		.filter(e -> e.estaIncluido(fechaInicio, fechaFin))
		.mapToDouble(e -> e.costoEnvio())
		.sum();
		
	}
	
	public List<Envio> getEnvios (){
		return  this.envios;
	}

}

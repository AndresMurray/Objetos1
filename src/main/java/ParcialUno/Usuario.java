package ParcialUno;

import java.util.*;
import java.time.*;

public class Usuario {
	
	private String nombre;
	private List<Entrada> entradas;
	
	public Usuario (String nombre) {
		this.nombre=nombre;
		this.entradas = new ArrayList<Entrada>();
	}
	
	public Entrada comprarEntrada (Evento unEvento, boolean seguro) {
		Entrada e = new Entrada (seguro,this,unEvento);
		this.entradas.add(e);
		return e;
	}
	
	public double getMontoTotal (LocalDate fechaInicial, LocalDate fechaFinal) {
		
		DateLapse periodo = new DateLapse (fechaInicial,fechaFinal);
		return this.entradas.stream()
				.filter(e -> periodo.includesDate(e.getFechaCompra()))
				.mapToDouble(ent -> ent.getCosto())
				.sum();
		
	}
	
	
	public Entrada getSigteEvento() {
		return this.entradas.stream()
		.filter(e -> e.getFechaCompra().isAfter(LocalDate.now()))
		.sorted((f1,f2) -> f1.getFechaEvento().compareTo(f2.getFechaEvento()))
		.findFirst().orElse(null);
	}
	

}

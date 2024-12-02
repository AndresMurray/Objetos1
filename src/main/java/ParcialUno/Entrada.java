package ParcialUno;

import java.time.*;

public class Entrada {
	
	private boolean seguroReembolso;
	private LocalDate fechaCompra;
	private Usuario usuario;
	private Evento evento;
	private double precio;

	
	public Entrada(boolean seguroReembolso,Usuario usuario, Evento evento) {
		this.seguroReembolso = seguroReembolso;
		this.fechaCompra = LocalDate.now();
		this.usuario = usuario;
		this.evento = evento;
		this.precio=evento.getPrecio(fechaCompra); // esta bien usar esto aca ??
	}
	
	
	
	public double montoDevolucion() {
		
	  int dias = Period.between(this.evento.getFecha(), this.fechaCompra).getDays();
	  double monto = 0;
	  if(this.seguroReembolso)
		 monto=this.precio*0.15;
	  
	  if(dias >=30)
		  return this.precio*0.50+monto;
	  else
		  return monto;
		
	}
	
	public double getCosto() {
		return this.precio;
	}
	
	public LocalDate getFechaCompra () {
		return this.fechaCompra;
	}
	
	public LocalDate getFechaEvento() {
		return evento.getFecha(); // esto podria ser variable de instancia o esta bien asi
	}
	
	
	
	
	

}

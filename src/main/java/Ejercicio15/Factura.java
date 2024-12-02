package Ejercicio15;
import java.time.LocalDate;

public class Factura {
	
	private String usuario;
	private LocalDate fecha;
	private String bonificacion;
	private double montoFinal;
	
	
	// factura con bonifiacion
	public Factura (String nombre, LocalDate fechaEmision, String bonificacion, double montoFinal) {
		this.usuario = nombre;
		this.fecha = fechaEmision;
		this.bonificacion = bonificacion;
		this.montoFinal=montoFinal;
	}
	
	
	// factura sin bonificacion
	public Factura (String nombre, LocalDate fechaEmision,  double montoFinal) {
		this.usuario = nombre;
		this.fecha = fechaEmision;
		this.montoFinal=montoFinal;
	}


	public String getUsuario() {
		return usuario;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public String getBonificacion() {
		return bonificacion;
	}


	public double getMontoFinal() {
		return montoFinal;
	}
	
	
	
		
		
		
		
		
	}
	
	



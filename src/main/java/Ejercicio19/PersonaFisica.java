package Ejercicio19;
import java.time.*;

public class PersonaFisica extends Cliente{
	
	private int dni;
	
	
	public PersonaFisica (String nombre, String direccion, int dni) {
		super(nombre, direccion);
		this.dni=dni;
	}
	
	public double calcularMonto (LocalDate fechaInicio, LocalDate fechaFin) {
		
		return super.calcularMonto(fechaInicio, fechaFin)*0.90;
	}

}

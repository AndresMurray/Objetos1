package Ejercicio20;
import java.time.*;

public class ReciboDeSueldo {
	
	private String nombre;
	private String apellido;
	private int CUIL;
	private int antiguedad;
	private LocalDate fechaCreacion;
	private double montoTotal;

	public ReciboDeSueldo(String nombre, String apellido, int CUIL, int antiguedad, LocalDate fechaCreacion,
			double montoTotal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.antiguedad = antiguedad;
		this.fechaCreacion = fechaCreacion;
		this.montoTotal = montoTotal;
	}

}

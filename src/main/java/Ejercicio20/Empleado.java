package Ejercicio20;
import java.time.LocalDate;
import java.util.*;

public class Empleado {
	
	private String nombre,apellido;
	private int CUIL;
	private LocalDate  fechaDeNacimiento;
	private boolean hijosACargo;
	private boolean conyugeAcargo;
	List<Contrato> contratos;
	
	
	public int calcularAntiguedadTotal () {
		return contratos.stream()
				.mapToInt(c -> c.getAntiguedad())
				.sum();
	}
	

	
	
	public ReciboDeSueldo generarRecibo() {
		
		Contrato c = contratos.stream().filter(con -> con.estaVigente()).findFirst().orElseThrow();
		
		ReciboDeSueldo recibo = new ReciboDeSueldo(this.nombre,this.apellido,this.CUIL,this.calcularAntiguedadTotal(),LocalDate.now(),c.montoTotal(this.calcularAntiguedadTotal()));
		return recibo;
		
	}
	
	public boolean tieneHijos () {
		return this.hijosACargo;
	}
	
	public boolean tieneConyuge() {
		return this.conyugeAcargo;
	}

}

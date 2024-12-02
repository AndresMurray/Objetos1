package Ejercicio15;
import java.util.*;
import java.time.LocalDate;


public class Usuario {
	
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	
	
	
	public Usuario (String nombre, String domicilio, List<Consumo> lista) {
		
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos=lista;
		
	}
	
	
	
	public Factura emitirFactura (CuadroTarifario cuadro) {
		
			if (this.calcularFactorPotencia())
				return new Factura(this.nombre,LocalDate.now(),"10%",this.montoFinal(cuadro));
			else
				return new Factura(this.nombre,LocalDate.now(),this.montoFinal(cuadro));
		
	}
	
	public Consumo getUltimoConsumo () {
		return consumos.stream()
			.max(Comparator.comparing(Consumo::getFecha))
			.orElse(null);
		
	}
	
	public LocalDate getFecha() {
		return this.getUltimoConsumo().getFecha();
	}
	
	
	public boolean calcularFactorPotencia() {
		
		double EnergiaActiva = this.getUltimoConsumo().getConsumoDeEnergiaActiva();
		double EnergiaReactiva = this.getUltimoConsumo().getConsumoDeEnergiaReactiva();
		
		double resultado =EnergiaActiva/Math.sqrt(Math.pow(EnergiaActiva, 2)+Math.pow(EnergiaReactiva, 2));
			
		if (resultado > 0.8)
			return true;
		else
			return false;
		
	}

	
	public double montoFinal (CuadroTarifario cuadro) {
		
		double costo = this.getUltimoConsumo().getConsumo(cuadro);	
		
		if(this.calcularFactorPotencia())
			return costo*0.90;
		else
			return costo;
	}
	
	
	
	

}

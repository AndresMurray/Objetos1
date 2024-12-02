package Ejercicio15;
import java.time.LocalDate;

public class Consumo {
	
	private int consumoDeEnergiaActiva;
	private int consumoDeEnergiaReactiva; // para determinar bonificacion
	private LocalDate fecha;
	
	


	public Consumo(int consumoDeEnergiaActiva, int consumoDeEnergiaReactiva, LocalDate fecha) {
		this.consumoDeEnergiaActiva = consumoDeEnergiaActiva;
		this.consumoDeEnergiaReactiva = consumoDeEnergiaReactiva;
		this.fecha = fecha;
	}

	public int getConsumoDeEnergiaActiva() {
		return consumoDeEnergiaActiva;
	}

	public int getConsumoDeEnergiaReactiva() {
		return consumoDeEnergiaReactiva;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getConsumo(CuadroTarifario cuadro) {  //podria estar aca o en factura
		return this.consumoDeEnergiaActiva*cuadro.getPreciokWh();
		
	}

}

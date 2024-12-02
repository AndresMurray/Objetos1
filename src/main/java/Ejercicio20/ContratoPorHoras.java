package Ejercicio20;
import java.time.*;

public class ContratoPorHoras extends Contrato{
	
	private double valorHora;
	private double numeroHorasPorMes;
	private LocalDate fechaFin;
	
	public boolean estaVigente() {
		return this.fechaFin.isAfter(LocalDate.now());
	}
	
	public double getSueldoBasico () {
		
		return this.valorHora*this.numeroHorasPorMes;
		
	}

}

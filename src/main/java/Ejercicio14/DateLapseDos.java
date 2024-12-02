package Ejercicio14;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateLapseDos implements Date{
	
	private LocalDate from;
	private int sizeInDays;
	
	
	public DateLapseDos(LocalDate from, LocalDate to) {
		this.from = from;
		this.sizeInDays = (int)from.until(to,ChronoUnit.DAYS);
	}



	public LocalDate getFrom() {
		return from;	
	}
	
	

	public LocalDate getTo() {
		return from.plusDays(sizeInDays);
	}

	
	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
	public int sizeInDays() {
		return this.sizeInDays;
	}
	

	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
	public boolean includesDate(LocalDate other) {
			
		if(from.isBefore(other) && this.getTo().isAfter(other)) 
			return true;
		else
			return false;
		
	}
	

}
